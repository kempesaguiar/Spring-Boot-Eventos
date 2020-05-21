package br.com.kca.springboot.eventos.springbooteventosapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.kca.springboot.eventos.springbooteventosapp.models.Aluno;
import br.com.kca.springboot.eventos.springbooteventosapp.repository.EventoRepository;

@Controller
public class AlunoController {
	
	@Autowired
	private EventoRepository re;
	
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
		
		re.save(aluno);
		
		return "redirect:/cadastrarEvento";
	}
	
	@RequestMapping("/alunos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("listaAlunos");
		Iterable<Aluno> alunos = re.findAll();
		mv.addObject("alunos", alunos);
		return mv;
	}

}
