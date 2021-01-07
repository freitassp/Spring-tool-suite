package br.com.samuel;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ContatosControle {
	
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 44 0000-0000"));
		LISTA_CONTATOS.add(new Contato("2", "joão", "+55 44 0000-0000"));
		LISTA_CONTATOS.add(new Contato("3", "Pedro", "+55 44 0000-0000"));
		LISTA_CONTATOS.add(new Contato("4", "Mariana", "+55 44 0000-0000"));
		LISTA_CONTATOS.add(new Contato("5", "Mario", "+55 44 0000-0000"));
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return modelAndView;
	}
	
	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", new Contato());
		return modelAndView;
		
	}

}
