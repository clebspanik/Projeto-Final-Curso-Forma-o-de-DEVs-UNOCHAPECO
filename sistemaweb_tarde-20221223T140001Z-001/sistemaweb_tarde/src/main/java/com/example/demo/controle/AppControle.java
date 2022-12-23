package com.example.demo.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppControle {
	@RequestMapping({"/", "/home"})
	public String home() {
		return "/index";
	}
}
