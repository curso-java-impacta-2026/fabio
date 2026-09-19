package br.com.impacta.prateleiradigital.testes;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteArrayFilmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Filme[] filmes = new Filme[3];

		System.out.println("Tamanho: " + filmes.length);
		System.out.println("Posição inicial: " + filmes[0]);

		filmes[0] = new Filme("Matrix", "Lana Wachowski, Lilly Wachowski", 8.7, 137, 1999, "Ação, Ficção científica",
				2000000, "https://exemplo.com/matrix");

		filmes[1] = new Filme("Interestelar", "Christopher Nolan", 8.7, 169, 2014, "Ficção científica", 2000000,
				"https://exemplo.com/interestelar");

		filmes[2] = new Filme("Poderoso Chefão", "Francis Ford Coppola", 9.2, 175, 1972, "Drama", 1900000,
				"https://exemplo.com/poderoso-chefao");

		mostrarFilmes(filmes);

	}

	// Chamar o método de apresentação dos filmes e passar o parâmetro

	public static void mostrarFilmes(Filme[] filmes) {

		for (Filme filme : filmes) {

			System.out.println("-----------------");
			System.out.println("Título: " + filme.getTitulo());
			System.out.println("Diretores: " + filme.getDiretores());
			System.out.println("Ano: " + filme.getAno());
			System.out.println("Nota: " + filme.getNota());
		} // fim do m
	}// fim do metodo mostrar filmes

}// fil da classe testearray filmes
