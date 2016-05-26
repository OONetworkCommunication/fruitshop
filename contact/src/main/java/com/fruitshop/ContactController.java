package com.fruitshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@Component
@Controller
public class ContactController {

    @Value("${shopinfo.title}")
    String shopTitle;

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", shopTitle);
        return "contact";
    }
}
