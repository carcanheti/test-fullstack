package com.test.api.config.initializer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.test.api.config.repository.*;
import com.test.api.model.entity.Usuario;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{

	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<Usuario> usuario = usuarioRepository.findAll();
		
		if( usuario.isEmpty()) {
		//	createUsuario(nome, Telefone, sexo, email);
			
		}
		
		
	//	usuarioRepository.deleteById(id);
		
	}

	// Insere um Usuario
	public void createUsuario(String nome, String Telefone, String sexo, String email) {
		Usuario usuario = new Usuario();
		usuarioRepository.save(usuario);
	}

	// Deleta um Usuario pelo Id 
	public void deleteUsuario(Long id) {
		Usuario usuario = new Usuario();
		usuarioRepository.deleteById(id);
		
	}
}
