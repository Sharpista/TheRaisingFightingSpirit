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
	private String dataDeNascimento;
	private String dataDeCadastro;
	private String correntista;
	
	
	
	
	
	public Segurado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Segurado(Integer id, String nome, String cpf, String sexo, String rg, String[] diasDeVisita,
			String dataDeNascimento, String dataDeCadastro, String correntista) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.rg = rg;
		this.diasDeVisita = diasDeVisita;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDeCadastro = dataDeCadastro;
		this.correntista = correntista;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Segurado [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", rg=" + rg
				+ ", diasDeVisita=" + Arrays.toString(diasDeVisita) + ", dataDeNascimento=" + dataDeNascimento
				+ ", dataDeCadastro=" + dataDeCadastro + ", correntista=" + correntista + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public void setDiasDeVisita(String[] bs) {
		this.diasDeVisita = bs;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(String dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	
	
	
	
	
	
}
