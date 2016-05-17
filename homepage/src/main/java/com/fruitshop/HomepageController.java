package com.fruitshop;

import groovy.lang.Grab;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Grab("org.webjars:jquery:2.0.3-1")
@RefreshScope
@Component
@Controller
public class HomepageController {

	@Value("${configuration.projectName}")
	String projectName;

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