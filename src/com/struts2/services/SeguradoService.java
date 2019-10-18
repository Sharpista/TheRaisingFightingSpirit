package com.struts2.services;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.entity.Segurado;
import com.struts2.entity.Seguro;
import com.struts2.persistence.SeguradoDAO;
import com.struts2.persistence.SeguroDAO;

public class SeguradoService extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	
	Segurado segurado = new Segurado();
	
	private String nome;
	private String cpf;
	private String sexo;
	private String rg;
	private String[] diasDeVisita;
	private Date dataDeNascimento;
	private Date dataDeCadastro;
	private String correntista;
	
	private List<Seguro>listaDeSeguros;
	private List<Segurado>listaDeSegurados;
	
	
	public String execute() throws Exception {
		this.segurado = new Segurado();
		SeguradoDAO sdao = new SeguradoDAO();
		
		
		try {
			sdao.criarSegurado(segurado);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
		
	}
	
	public String listar() {
		SeguradoDAO dao = new SeguradoDAO();
		listaDeSegurados = dao.listarSegurado();
		return SUCCESS;
	}
	
	public String mostrarSeguros() throws Exception {
		
		SeguroDAO sdao = new SeguroDAO();
		listaDeSeguros = sdao.listarSeguros();
		return SUCCESS;
	}

	public String delete() throws Exception{
		try {
			SeguradoDAO sdao = new SeguradoDAO();
			sdao.deleteSegurado(segurado);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	public String update() throws Exception{
		try {
			SeguradoDAO sdao = new SeguradoDAO();
			
			sdao.deleteSegurado(segurado);
			
			return SUCCESS;
		} catch (Exception e) {

			return ERROR;
		}
	}
	public Segurado getSegurado() {
		return segurado;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
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

	public List<Segurado> getListaDeSegurado() {
		return listaDeSegurados;
	}

	public void setListaDeSegurado(List<Segurado> listaDeSegurado) {
		this.listaDeSegurados = listaDeSegurado;
	}
	
	
	
	
}
