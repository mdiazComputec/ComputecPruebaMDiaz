package com.Computec.Prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Computec.Prueba.model.Cliente;
import com.Computec.Prueba.service.api.ClienteServiceAPI;

@Controller
public class ClienteController {
	@Autowired
	private ClienteServiceAPI clienteServiceAPI;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", clienteServiceAPI.getAll());
		return "index";
	}
	
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("cliente", clienteServiceAPI.get(id));
		}else {
			model.addAttribute("cliente", new Cliente());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Cliente cliente, Model model) {
		clienteServiceAPI.save(cliente);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		clienteServiceAPI.delete(id);
		
		return "redirect:/";
	}
	
	
}
