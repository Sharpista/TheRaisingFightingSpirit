package com.struts2.entity;

import java.util.Arrays;
import java.util.Date;

public class Segurado {

	private Integer id;
	private String nome;
	private String cpf;
	private String sexo;
	private String rg;
	private String[] diasDeVisita;
	private Date dataDeNascimento;
	private Date dataDeCadastro;
	private String correntista;
	
	
	
	
	
	public Segurado(String nome, String cpf, String sexo, String rg, String[] diasDeVisita,  Date  dataDeNascimento,
			String correntista, Date dataDeCadastro) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.rg = rg;
		this.diasDeVisita = diasDeVisita;
		this.dataDeNascimento = dataDeNascimento;
		this.correntista = correntista;
	}

	
	

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}




	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}




	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Segurado() {
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String[] getDiasDeVisita() {
		return diasDeVisita;
	}



	public void setDiasDeVisita(String[] diasDeVisita) {
		this.diasDeVisita = diasDeVisita;
	}



	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}



	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}



	public String getCorrentista() {
		return correntista;
	}



	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}



	@Override
	public String toString() {
		return "Segurado [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", rg=" + rg + ", diasDeVisita="
				+ Arrays.toString(diasDeVisita) + ", dataDeNascimento=" + dataDeNascimento + ", correntista="
				+ correntista + "]";
	}
	
}
