package com.struts2.services;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.entity.Seguro;
import com.struts2.persistence.SeguroDAO;

public class SeguroService extends ActionSupport {
	
	
	private static final long serialVersionUID = 1L; 
	private Seguro seguro;
	
	private Double valor;
	
	private String tipo;
	
	private Integer id;
	
	private List<Seguro>listaDeSeguros;
	
	
	public String execute() throws Exception{
		this.seguro = new Seguro(tipo,valor);
		SeguroDAO sdao = new SeguroDAO();
		
		try {
			sdao.criarSeguro(this.seguro);
			 return SUCCESS;
			
		} catch (Exception e) {
			return ERROR; 	
		}
		 	
	}
	
	public String listar() {
			SeguroDAO dao = new SeguroDAO();
			listaDeSeguros = dao.listarSeguros();
			return SUCCESS;		 	
	}


	public Seguro getSeguro() {
		return seguro;
	}


	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Seguro> getListaDeSeguros() {
		return listaDeSeguros;
	}


	public void setListaDeSeguros(List<Seguro> listaDeSeguros) {
		this.listaDeSeguros = listaDeSeguros;
	}
	
	
	

}
