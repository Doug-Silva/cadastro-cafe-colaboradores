package com.cadastroapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cadastroapp.models.Setor;
import com.cadastroapp.repository.SetorRepository;

@Controller
public class SetorController {
	
	@Autowired
	private SetorRepository sr;
	
	@RequestMapping(value="/cadastrarSetor", method=RequestMethod.GET)
	public String form() {
		return "cadastroSetor/formCadastroSetor";
	}
	
	@RequestMapping(value="/cadastrarSetor", method=RequestMethod.POST)
	public String form(Setor setor) {
		
		sr.save(setor);
		
		return "redirect:/cadastrarSetor";
	}

}
