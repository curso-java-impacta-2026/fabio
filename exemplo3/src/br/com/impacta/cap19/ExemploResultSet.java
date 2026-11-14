package br.com.impacta.cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploResultSet {

	public static void main(String[] args) {

		try {

			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "impacta1");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT nome, telefone FROM alunos");

			while (rs.next()) {
				String nome = rs.getString("nome");
				String tel = rs.getString("telefone");
				System.out.println(nome + " - " + tel);
			}

			rs.close();
			st.close();
			cn.close();
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação.");
			e.printStackTrace();
		}
	}
}
