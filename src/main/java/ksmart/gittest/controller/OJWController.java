package ksmart.gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OJWController {

	@GetMapping("/ojw")
	public String ojw(){
		return "ojw";
	}


	
}
