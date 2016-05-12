package com.fruitshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact(@RequestParam(value="name", required=false, defaultValue="Contact") String name, Model model) {
		model.addAttribute("name", name);

		return "contact";
	}
}