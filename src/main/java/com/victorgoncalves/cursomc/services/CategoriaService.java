package com.victorgoncalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorgoncalves.cursomc.domain.Categoria;
import com.victorgoncalves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {
		Optional<Categoria> optional = categoriaRepository.findById(id);
		return optional.orElse(null);
	}

}
