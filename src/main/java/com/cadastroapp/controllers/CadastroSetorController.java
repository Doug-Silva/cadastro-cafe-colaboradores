package com.cadastroapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroSetorController {
	
	@RequestMapping("cadastrarSetor")
	public String form() {
		return "cadastroSetor/formCadastroSetor";
	}

}
