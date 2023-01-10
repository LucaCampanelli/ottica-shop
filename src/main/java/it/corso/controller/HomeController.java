package it.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/", "/index", "/home"})
public class HomeController {

	@GetMapping
	public String getpage() {
		return "home";
	}
}