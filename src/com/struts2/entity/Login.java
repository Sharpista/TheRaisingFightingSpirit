package com.struts2.entity;

public class Login {

	private String usuario;
	private String senha;
	
	
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public Login() {
		
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String email) {
		this.usuario = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
