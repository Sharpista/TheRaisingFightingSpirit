package com.struts2.persistence;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.struts2.entity.Seguro;



public class SeguroDAO extends DAO {


	public void criarSeguro(Seguro seguro) throws Exception {
		try {
			abrir();
			ps = online.prepareStatement("INSERT INTO seguro values (null,?,?)");
			ps.setString(1, seguro.getTipo());
			ps.setDouble(2, seguro.getValor());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fechar();
				ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void deleteSeguro(Seguro seguro) throws Exception {

		String sql = "DELETE FROM Seguro WHERE id = '?'";
		try {
			abrir();
			ps = online.prepareStatement(sql);
			ps.setInt(1, seguro.getId_seguro());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fechar();
				ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public Seguro findById(int id) {

		try {
			abrir();
			String sqlFind = "SELECT * FROM Seguro WHERE ID = ?";
			ps = online.prepareStatement(sqlFind);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			Seguro seguro = new Seguro();
			seguro.setId_seguro(rs.getInt("id_seguro"));
			ps.close();
			fechar();

			return seguro;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public void updateSeguro(Seguro seguro) throws Exception {

		String sql = "UPTADE Seguro set tipo = ?, valor = ? where id_seguro = ?";

		try {
			abrir();
			ps = online.prepareStatement(sql);
			ps.setString(1, seguro.getTipo());
			ps.setDouble(2, seguro.getValor());
			ps.execute();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				ps.close();
				fechar();
			} catch (Exception e2) {
				System.err.println(e2);
			}
		}
	}

	public List<Seguro> listarSeguros() {
		
		List<Seguro> listaDeSeguros = new ArrayList<Seguro>();

		try {
			Statement stmt;
			Seguro seguro = null;
			String sql = "SELECT * FROM Seguro";
			abrir();
			stmt = online.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				seguro = new Seguro();
				seguro.setId_seguro(new Integer(rs.getInt("id_seguro")));
				seguro.setTipo(rs.getString("tipo"));
				seguro.setValor(rs.getDouble("valor"));
				listaDeSeguros.add(seguro);
			}
			online.close();
			stmt.close();
			rs.close();
			fechar();
		} catch (Exception e) {
			System.err.println(e);
		} 
		
		return listaDeSeguros;
	}
	
	
}

