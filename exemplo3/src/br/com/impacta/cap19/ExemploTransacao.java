package br.com.impacta.cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploTransacao {

	public static void main(String[] args) {
		try {
			realizaOperacao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void realizaOperacao() throws Exception {
		Connection cn = null;
		Statement st = null;

		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "impacta1");
			cn.setAutoCommit(false);

			st = cn.createStatement();
			st.executeUpdate(
					"INSERT INTO alunos (codigo, nome, telefone) VALUES (8, 'Marcos Luiz', '(11) 94522-5050')");
			st.executeUpdate("DELETE FROM alunos WHERE codigo = 6");
			st.executeUpdate("UPDATE alunos SET nome = 'Eduardo Gigi' WHERE codigo = 4");

			cn.commit();
		} catch (SQLException e) {
			cn.rollback();
			throw new Exception("Falha ao acessar base de dados.", e);
		} finally {
			st.close();
			cn.close();
		}
	}
}
