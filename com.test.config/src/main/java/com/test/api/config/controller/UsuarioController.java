package com.test.api.config.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.api.config.repository.UsuarioRepository;
import com.test.api.model.entity.Usuario;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	
	// Listar todos usuarios
	@GetMapping("/list")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("/list");
		mv.addObject("usuario", usuarioRepository.findAll());
		return mv;
	}

	// Listar um usuario pelo Id especifico
	@GetMapping("/usuario/{id}")
	public Usuario recuperaUsuario(@PathVariable("id") Long id) throws Exception {
		Optional<Usuario> usuario = usuarioRepository.findById(id);

		if (usuario.isPresent()) {
			throw new Exception(" Usuário de id - " + id + " não localizado");
		}

		return usuario.get();
	}

	@GetMapping("/editar/{id}")
	public Usuario editaUsuario(@PathVariable("id") Long id) throws Exception {
		Optional<Usuario> usuario = usuarioRepository.findById(id);

		if (usuario.isPresent()) {
			throw new Exception(" Usuário de id - " + id + " não localizado");
		}

		return usuario.get();
	}

	// Deletar um usuario especifico pelo Id
	@DeleteMapping("/deletar/{id}")
	public void deleteUsuario(@PathVariable("id") Long id) {
		usuarioRepository.deleteById(id);
	}

	// Salvar um registro de usuario
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		usuario = usuarioRepository.save(usuario);
		return usuario;

	}

	@PostMapping("/salvar")
	public Usuario usuarioSubmit(@ModelAttribute Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
