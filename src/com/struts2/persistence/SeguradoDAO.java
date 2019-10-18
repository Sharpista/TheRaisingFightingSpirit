package com.struts2.persistence;

import java.sql.Date;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.Time;

import com.struts2.entity.Segurado;

public class SeguradoDAO extends DAO {

	
	public Statement stmt;

	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	public void criarSegurado(Segurado segurado) throws Exception {
		try {
			abrir();
			stmt = online.prepareStatement(
					"INSERT INTO Segurado values(null,?,?,?,?,?,?,?,?)");
			ps.setString(1, segurado.getNome());
			ps.setString(2, segurado.getCpf());
			ps.setString(3, segurado.getRg());
			ps.setString(4, segurado.getSexo());
			StringBuffer sb = new StringBuffer();
			for (String diasDeVisita : segurado.getDiasDeVisita()) {
				sb.append(diasDeVisita);
				sb.append(" ");
			}
			ps.setNString(5, sb.toString());
			
			ps.setDate(6, (java.sql.Date) segurado.getDataDeNascimento());
			ps.setString(7, segurado.getCorrentista());
			ps.setString(8, format.format(new Timestamp(new Date(0).getTime())));
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fechar();
				ps.close();
				online.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public Segurado findById(int id) {
		
		try {
			abrir();
			String sqlFind = "SELECT * FROM Segurado WHERE ID = ?";
			ps = online.prepareStatement(sqlFind);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			Segurado segurado = new Segurado();
			segurado.setId(rs.getInt("id"));
			ps.close();
			fechar();
			
			return segurado;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public void deleteSegurado(Segurado segurado) throws Exception {
		try {
			abrir();
			ps = online.prepareStatement("DELETE FROM Segurado WHERE id = '?'");
			ps.setInt(1, segurado.getId());
			ps.execute();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				fechar();
				ps.close();
				online.close();
			} catch (Exception e2) {

			}
		}

	}

	public void updateSegurado(Segurado segurado) throws Exception {

		String sql = "UPDATE Segurado set nome=?, cpf = ?, rg = ?, sexo = ?, diasDeVisitas = ?, correntista = ?, dataDeAniversario = ? WHERE id = ? ";
		try {
			abrir();
			ps = online.prepareStatement(sql);
			ps.setString(1, segurado.getNome());
			ps.setString(2, segurado.getCpf());
			ps.setString(3, segurado.getRg());
			ps.setString(4, segurado.getSexo());
			StringBuffer sb = new StringBuffer();
			for (String diasDeVisita : segurado.getDiasDeVisita()) {
				sb.append(diasDeVisita);
				sb.append(" ");
			}
			ps.setNString(5, sb.toString());
			ps.setDate(6, (java.sql.Date) segurado.getDataDeNascimento());
			ps.setString(7, segurado.getCorrentista());
			ps.execute();

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				fechar();
				ps.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public List<Segurado>listarSegurado() {

		List<Segurado> listaDeSegurados = new ArrayList<Segurado>();
		try {
			Segurado segurado = null;
			String sql = "SELECT * FROM Segurado";
			abrir();
			stmt = online.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				segurado = new Segurado();
				segurado.setId(new Integer(rs.getInt("id")));
				segurado.setNome(rs.getString("nome"));
				segurado.setCpf(rs.getString("cpf"));
				segurado.setRg(rs.getString("rg"));
				segurado.setSexo(rs.getString("sexo"));
				segurado.setCorrentista(rs.getString("correntista"));
				segurado.setDataDeNascimento(rs.getDate("dataDeAniversario"));
				listaDeSegurados.add(segurado);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				fechar();
				stmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return listaDeSegurados;

	}
}
