package com.fruitshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
	public static List<String> fruits;

	public SearchController() {
		fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Raspberry");
		fruits.add("Orange");
		fruits.add("Lemon");
		fruits.add("Blueberry");
		fruits.add("strawberry");
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
		return "search";
	}

}
