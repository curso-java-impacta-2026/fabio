package br.com.impacta.prateleiradigital.controle;

import java.sql.SQLException;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

public class FilmeController {

	private FilmeDAO filmeDAO = new FilmeDAO();

	public int cadastroDeFilme(Filme filme) throws SQLException {

		return this.filmeDAO.insert(filme);

	}

}
