package com.test.api.config.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.api.model.entity.Usuario; 

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	// Inteface para realizar o CRUD
	
    // Método para listar todos os usuários 
	List<Usuario> findAll();
	
	// Método para buscar um registro pelo Id especifico
	
	Usuario finById(Long id);

	Usuario findOne(Long id);

	
	
	
}
