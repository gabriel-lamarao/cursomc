package com.gabriel.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.cursomc.domain.Cliente;
import com.gabriel.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new com.gabriel.cursomc.exceptions.ObjectNotFoundException(
				"Objto não encontrado! Id: "+ id + ", Tipo: "+ Cliente.class.getName()));
		
	}
}
