package com.fruitshop;

import groovy.lang.Grab;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mixmox on 04/04/16.
 */
@Grab("org.webjars:jquery:2.0.3-1")
@RefreshScope
@Component
@Controller
public class HomepageController {

        @Value("${shopinfo.title}")
        String shopTitle;

        @RequestMapping("/")
        public String homepage(Model model) {
                model.addAttribute("title", "Welcome to " + shopTitle + " ~");
                return "homepage";
        }

}

