package com.cadastroapp.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Setor implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo;
	
	//CADASTRAR CAFÉ DA MANHÃ DOS COLABORADORES, SEPARADO PELO SETOR
	private String nomeSetor;
	private String nomeSupervisor;
	private String dataCadastro;
	private String horaCadastro;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNomeSetor() {
		return nomeSetor;
	}
	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
	public String getNomeSupervisor() {
		return nomeSupervisor;
	}
	public void setNomeSupervisor(String nomeSupervisor) {
		this.nomeSupervisor = nomeSupervisor;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getHoraCadastro() {
		return horaCadastro;
	}
	public void setHoraCadastro(String horaCadastro) {
		this.horaCadastro = horaCadastro;
	}
	
}
