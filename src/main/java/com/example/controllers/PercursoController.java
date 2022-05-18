package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Percurso;

@Controller()
public class PercursoController {

	@GetMapping("/percurso/index")
	public ModelAndView criarPercurso() {
		ModelAndView model = new ModelAndView("percurso/index");
		
		Percurso percurso= new Percurso();
		
		model.addObject("percurso",percurso);
		
		return model;
	}
}
