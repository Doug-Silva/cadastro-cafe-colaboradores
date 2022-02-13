package com.cadastroapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Colaborador {
	
	@Id
	private String cpf;
	private String nomeColaborador;
	private String refeicao;
	
	@ManyToOne
	private Setor setor;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	public String getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(String refeicao) {
		this.refeicao = refeicao;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
}
