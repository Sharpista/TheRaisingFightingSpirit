package com.struts2.services;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.entity.Login;
import com.struts2.persistence.LoginDAO;


public class LoginService extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String usuario;
	private String senha;

	public String execute() throws Exception {
		Login login = new Login(usuario, senha);
		LoginDAO ldao = new LoginDAO();

		if(ldao.existeUsuario(login)) {
			return SUCCESS;
		}else {
			addActionError(getText("error.login"));
			return ERROR;
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
