package com.tush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class AppController {

	@Autowired
	private LCAppService lc;

	@GetMapping("/home")
	public String homepage() {

		return "home";
	}

	@PostMapping("/Calculate_love")
	public String proceess_Registration(@RequestParam String username, @RequestParam String crushname, Model model) {

		String appResult = lc.CalculateLove(username, crushname);
		//System.out.println("" + appResult);
		model.addAttribute("result", appResult);

		return "home";

	}
	
}
