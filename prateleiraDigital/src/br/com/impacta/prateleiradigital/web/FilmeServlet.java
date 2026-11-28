package br.com.impacta.prateleiradigital.web;

import java.io.IOException;
import java.sql.SQLException;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilmeServlet
 */
@WebServlet("/filmes")
public class FilmeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final FilmeController controller = new FilmeController();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			request.setAttribute("Filmes", controller.listaDeFilmes());

			request.getRequestDispatcher("//WEB-INF/views/Filmes.jsp").forward(request, response);
		} catch (SQLException e) {

		}
	}

}
