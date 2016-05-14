package com.fruitshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.net.*;
import java.util.*;

@Controller
public class BasketController {

    @RequestMapping("/basket")
    public String basket(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
        CookieManager cm = new CookieManager();
        List<HttpCookie> cookies = cm.getCookieStore().getCookies();
        List<String> itemList = new ArrayList<String>();

        for(HttpCookie item : cookies) {
            itemList.add(item.getValue());
        }

        model.addAttribute("name", String.valueOf(cookies.size()));
        model.addAttribute("itemList",itemList);

        return "basket";
    }

    @RequestMapping(value ="/basket", params = {"add"}, method = RequestMethod.GET)
    public String basket(@RequestParam(value = "add") String item, HttpServletResponse response, Model model) {
        CookieManager cm = new CookieManager();
        cm.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(cm);

        List<HttpCookie> cookies = cm.getCookieStore().getCookies();
        response.addCookie(new Cookie(String.valueOf(cookies.size()), item));

        return "basket";
    }
}