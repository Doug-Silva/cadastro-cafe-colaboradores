package com.cadastroapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cadastroapp.models.Setor;
import com.cadastroapp.repository.SetorRepository;

@Controller
public class SetorController {
	
	@Autowired
	private SetorRepository sr;
	
	@RequestMapping(value="/cadastrar-setor", method=RequestMethod.GET)
	public String form() {
		return "cadastroColaboradores/formCadastroSetor";
	}
	
	@RequestMapping(value="/cadastrar-setor", method=RequestMethod.POST)
	public String form(Setor setor) {
		
		sr.save(setor);
		
		return "redirect:/cadastrar-setor";
	}
	
	@RequestMapping("/lista-cadastros")
	public ModelAndView listaSetores(){
		ModelAndView mv = new ModelAndView("index");
		Iterable<Setor> setores = sr.findAll();
		mv.addObject("setores", setores);
		return mv;
	}
	

	@RequestMapping("/{codigo}")
	public ModelAndView detalhesSetor(@PathVariable("codigo") long codigo){
		Setor setor = sr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("cadastroColaboradores/formCadastroColaborador");
		mv.addObject("setor", setor);
		return mv;
	}
	
}
