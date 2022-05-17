package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class ProdutoController {

	@GetMapping("/produto")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("produto/index");
		
		return model;
	}
}
