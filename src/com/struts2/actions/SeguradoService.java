package com.struts2.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.entity.Segurado;
import com.struts2.entity.Seguro;
import com.struts2.persistence.SeguradoDAO;
import com.struts2.persistence.SeguroDAO;

public class SeguradoService extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	
	Segurado segurado = null;
	private String nome;
	private String cpf;
	private String sexo;
	private String rg;
	private String[] diasDeVisita;
	private String dataDeNascimento;
	private String dataDeCadastro;
	private String correntista;
	private List<String>listaDeDias;
	private List<String>listaDeGeneros;
	private List<Seguro>listaDeSeguros;
	private List<Segurado>listaDeSegurados;
	private List<String> listOpc;
	
	
	public String cadastrar() throws Exception {
		Segurado segurado = new Segurado();
		SeguradoDAO sdao = new SeguradoDAO();
		
		try {
			segurado.setNome(nome);
			segurado.setSexo(sexo);
			segurado.setCorrentista(correntista);
//			segurado.setDataDeCadastro(dataDeCadastro);
			segurado.setCpf(cpf);
			segurado.setDataDeNascimento(dataDeNascimento);
			segurado.setRg(rg);
			segurado.setDiasDeVisita(diasDeVisita);
			sdao.criarSegurado(segurado);
			
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
		
	}
	
	public String abrirCadastro() throws Exception {
		this.segurado = new Segurado();
		SeguradoDAO sdao = new SeguradoDAO();
		listOpc = new ArrayList<String>();
		listaDeGeneros = new ArrayList<String>();
		listaDeDias = new ArrayList<String>();
		listaDeSeguros = new ArrayList<Seguro>();
		try {
			listaDeDias();
			listaDeGenero();
			listaDeOpcoes();
			mostrarSeguros();
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
		
	}
	
	public void listaDeOpcoes() {
		
		listOpc.add("SIM");
		listOpc.add("NÃO");
	}
	
	public void listaDeGenero() {
		
		listaDeGeneros.add("Masculino");
		listaDeGeneros.add("Feminino");
	}
	
	public void listaDeDias() {
		
		listaDeDias.add("SEGUNDA-FEIRA");
		listaDeDias.add("TERÇA-FEIRA");
		listaDeDias.add("QUARTA-FEIRA");
		listaDeDias.add("QUINTA-FEIRA");
		listaDeDias.add("SEXTA-FEIRA");
	}
	
	
	public String listarSegurados() {
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
			
			sdao.updateSegurado(segurado);
			
			return SUCCESS;
		} catch (Exception e) {

			return ERROR;
		}
	}
	
	
	
	public List<String> getListaDeDias() {
		return listaDeDias;
	}

	public void setListaDeDias(List<String> listaDeDias) {
		this.listaDeDias = listaDeDias;
	}

	public List<String> getListaDeGeneros() {
		return listaDeGeneros;
	}

	public void setListaDeGeneros(List<String> listaDeGeneros) {
		this.listaDeGeneros = listaDeGeneros;
	}

	public List<Seguro> getListaDeSeguros() {
		return listaDeSeguros;
	}

	public void setListaDeSeguros(List<Seguro> listaDeSeguros) {
		this.listaDeSeguros = listaDeSeguros;
	}

	public List<Segurado> getListaDeSegurados() {
		return listaDeSegurados;
	}

	public void setListaDeSegurados(List<Segurado> listaDeSegurados) {
		this.listaDeSegurados = listaDeSegurados;
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

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
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

	public List<String> getListOpc() {
		return listOpc;
	}

	public void setListOpc(List<String> listOpc) {
		this.listOpc = listOpc;
	}

	public String getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(String dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	 
	
	
	
	
}
