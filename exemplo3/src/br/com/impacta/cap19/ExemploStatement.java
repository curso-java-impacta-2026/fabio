package br.com.impacta.cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploStatement {

	public static void main(String[] args) {

		try {

			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "impacta1");

			Statement st = cn.createStatement();

			st.executeUpdate("UPDATE alunos SET nome = 'Maria' where codigo = 2");
			System.out.println("Registro alterado com sucesso!");

			st.close();
			cn.close();
			System.out.println("Conexão encerrada.");

		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação.");
			e.printStackTrace();
		}
	}
}
