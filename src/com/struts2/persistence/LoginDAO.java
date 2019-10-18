package com.struts2.persistence;

import com.struts2.entity.Login;

public class LoginDAO extends DAO {

	public boolean existeUsuario(Login login) throws Exception {

		try {

			abrir();
			String query = "select usuario , senha from login where usuario = '" + login.getUsuario() + "' and senha= '"
					+ login.getSenha() + "';";
			ps = online.prepareStatement(query);
			
			
			
			rs = ps.executeQuery(query);
			if (rs.next()) {

				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.err.println(e);
			return false;
		} finally {
			fechar();
		}

	}

}
