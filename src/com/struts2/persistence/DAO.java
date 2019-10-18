package com.struts2.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.struts2.persistence.DAO;

public class DAO {

	public static Connection online;
	
	public static PreparedStatement ps;
	
	public static ResultSet rs;
	
	public static void abrir() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		online = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_segurados?useTimezone=true&serverTimezone=UTC","root","123456");
	}
	public static void fechar() throws Exception {
		online.close();
	}

}
