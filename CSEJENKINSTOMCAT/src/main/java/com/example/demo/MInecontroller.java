package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MInecontroller {

	@GetMapping("/home")
	public String disp() {
		 return "display";
	}
}
