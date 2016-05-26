package com.fruitshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mixmox on 04/04/16.
 */
@RefreshScope
@Component
@Controller
public class BasketController {

    @Value("${shopinfo.title}")
    String shopTitle;

    @RequestMapping("/basket")
    public String basket(Model model){

        model.addAttribute("title",shopTitle);

        return "basket";
    }

}
