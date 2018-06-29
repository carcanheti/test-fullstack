package com.test.api.service.busnisses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.api.config.repository.UsuarioRepository;
import com.test.api.model.entity.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	// Criação do CRUD

	// Metodo para listar todos usuarios
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	// Metodo para buscar um usuario especifico pelo Id
	public Usuario findById(Long id) {
		return usuarioRepository.finById(id);
	}

	// Metodo para alterar um usuario especifico pelo Id
	public Usuario findOne(Long id) {
		return usuarioRepository.findOne(id);

	}

	// Metodo para salvar/inserir o usuario
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	// Metodo para deletar um usuario
	public void delete(Long id) {
		usuarioRepository.deleteById(id);

	}

}
