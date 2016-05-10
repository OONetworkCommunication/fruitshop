package com.fruitshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.java.*;

@SpringBootApplication
@RestController
public class BasketApplication {

	public List<String> productList;
	public int position; 

	@RequestMapping("/add")
	public  add(position){
		productList.add();

	}

	@RequestMapping("/remove")
	public  remove(position)
		productList.remove();
	}
	public static void main(String[] args) {
		productList = new ArrayList();

		SpringApplication.run(BasketApplication.class, args);

	}
}
