package com.fruitshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@Component
@RestController
public class ContactController {

    @Value("${shopinfo.title}")
    String shopTitle;
    @RequestMapping("/contact")
    public String contact(@RequestParam(value="name", required=false, defaultValue="Contact") String name, Model model) {
        model.addAttribute("name", shopTitle);

        return "contact";
    }
}
