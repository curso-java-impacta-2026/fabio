package br.com.impacta.cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExemploPreparedStatement {

	public static void main(String[] args) {

		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "impacta1");

			PreparedStatement ps = cn.prepareStatement("INSERT INTO alunos VALUES (?, ?, ?)");

			ps.setInt(1, 4);
			ps.setString(2, "Francisco Chiquinho");
			ps.setString(3, "(12) 93233-1515");
			int retorno = ps.executeUpdate();

			System.out.println("Aluno cadastrado com sucesso.");
			System.out.println("Retorno do método: " + retorno);

			ps.close();
			cn.close();
			System.out.println("Conexão encerrada.");

		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação.");
			e.printStackTrace();
		}
	}
}
