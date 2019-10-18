package com.struts2.entity;

public class Seguro {

	private Integer id_seguro;
	private String tipo;
	private Double valor;
	
	
	public Seguro() {
		
	}
	public Seguro(String tipo, Double valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public Integer getId_seguro() {
		return id_seguro;
	}

	public void setId_seguro(Integer id_seguro) {
		this.id_seguro = id_seguro;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Seguro [tipo=" + tipo + ", valor=" + valor + "]";
	}
}
