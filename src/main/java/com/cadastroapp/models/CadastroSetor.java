package com.cadastroapp.models;

//CADASTRAR CAFÉ DA MANHÃ DOS COLABORADORES, SEPARADO PELO SETOR
public class CadastroSetor {
	
	private String nomeSetor;
	private String nomeSupervisor;
	private String dataCadastro;
	private String horaCadastro;
	
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
