package com.cadastroapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.cadastroapp.models.Colaborador;
import com.cadastroapp.models.Setor;

public interface ColaboradorRepository extends CrudRepository<Colaborador, String>{
	Iterable<Colaborador> findBySetor(Setor setor);

}
