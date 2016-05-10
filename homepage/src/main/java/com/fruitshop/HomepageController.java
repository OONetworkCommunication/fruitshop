package com.fruitshop;

import groovy.lang.Grab;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Grab("org.webjars:jquery:2.0.3-1")
@Controller
public class HomepageController {

	@RequestMapping("/")
	public String homepage(Model model) {
		model.addAttribute("title", "Welcome to FruitShop ~");
		return "homepage";
	}

}


/*
@RestController
@SpringBootApplication
public class HomepageController {
	public static void main(String[] args) {
		SpringApplication.run(HomepageController.class, args);

	}

	@RequestMapping("/")
	public String home() {
		return "Welcome to FruitShop ~";
	}



}*/