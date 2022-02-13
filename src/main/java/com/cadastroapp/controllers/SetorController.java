package com.cadastroapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cadastroapp.models.Colaborador;
import com.cadastroapp.models.Setor;
import com.cadastroapp.repository.ColaboradorRepository;
import com.cadastroapp.repository.SetorRepository;

@Controller
public class SetorController {
	
	@Autowired
	private SetorRepository sr;
	
	@Autowired
	private ColaboradorRepository cr;
	
	@RequestMapping(value="/cadastrar-setor", method=RequestMethod.GET)
	public String form(){
		return "cadastroColaboradores/formCadastroSetor";
	}
	
	@RequestMapping(value="/cadastrar-setor", method=RequestMethod.POST)
	public String form(@Valid Setor setor, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Erro: Verifique se todos os campos foram preenchidos!");
			return "redirect:/cadastrar-setor";
		}
		
		sr.save(setor);
		attributes.addFlashAttribute("mensagem", "Setor do colaborador foi adicionado com sucesso!");
		return "redirect:/cadastrar-setor";
	}
	
	@RequestMapping("/lista-cadastros")
	public ModelAndView listaSetores(){
		ModelAndView mv = new ModelAndView("index");
		Iterable<Setor> setores = sr.findAll();
		mv.addObject("setores", setores);
		return mv;
	}
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ModelAndView detalhesSetor(@PathVariable("codigo") long codigo){
		Setor setor = sr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("cadastroColaboradores/formCadastroColaborador");
		mv.addObject("setor", setor);
		Iterable<Colaborador> colaboradores = cr.findBySetor(setor);
		mv.addObject("colaboradores", colaboradores);
		return mv;
	}
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.POST)
	public String detalhesSetorPost(@PathVariable("codigo") long codigo, 
	@Valid Colaborador colaborador, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Erro: Verifique se todos os campos foram preenchidos!");
			return "redirect:/{codigo}";
		}
		
		Setor setor = sr.findByCodigo(codigo);
		colaborador.setSetor(setor);
		cr.save(colaborador);
		attributes.addFlashAttribute("mensagem", "Sua opção de café da manhã foi adicionado com sucesso!");
		return "redirect:/{codigo}";
	}
	
}
