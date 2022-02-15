package com.cadastroapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.cadastroapp.models.Setor;

public interface SetorRepository extends CrudRepository<Setor, String>{
	Setor findByCodigo(long codigo);
}
