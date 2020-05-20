package br.com.kca.springboot.eventos.springbooteventosapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.kca.springboot.eventos.springbooteventosapp.models.Aluno;
import br.com.kca.springboot.eventos.springbooteventosapp.repository.EventoRepository;

@Controller
public class AlunoController {
	
	private EventoRepository er;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.GET)
	public String form() {
		return "cadEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.POST)
	public String form(Aluno aluno) {
		
		er.save(aluno);
		
		return "redirect:/cadastrarEvento";
	}

}
