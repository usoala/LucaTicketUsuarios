package com.example.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Usuario;
import com.example.spring.service.UsuarioService;

/**
 * @Project LucaTicketUsuarioService
 *
 * @ClassName UsuarioController
 *
 * @author Jennifer Pérez
 *
 * @date 7 jul. 2021
 * 
 * @version 1.0
 */
@RestController
@RequestMapping 
public class UsuarioController {
	/**
	 * Atributo serv
	 * 
	 * 
	 */
	@Autowired
	private UsuarioService serv;

	
	/**
	 * @param usuario
	 * @return
	 */
	@PostMapping("/usuarios/add")
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return this.serv.save(usuario);
		
	}	
}
