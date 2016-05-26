package com.fruitshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mixmox on 04/04/16.
 */
@RefreshScope
@Component
@Controller
public class SearchController {

    @Value("${shopinfo.title}")
    String shopTitle;

    public static List<String> fruits;


    public SearchController() {
        fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Raspberry");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Blueberry");
        fruits.add("Strawberry");
    }

    @RequestMapping(value ="/search", params = {"w"}, method = RequestMethod.GET)
    public String search(@RequestParam(value = "w") String keywords, Model model) {
        List<String> results = new ArrayList<>();
        for (String fruit : fruits) {
            if(fruit.contains(keywords)) {
                results.add(fruit);
            }
        }
        model.addAttribute("results",results);
        model.addAttribute("title", shopTitle);
        return "search";
    }
}
