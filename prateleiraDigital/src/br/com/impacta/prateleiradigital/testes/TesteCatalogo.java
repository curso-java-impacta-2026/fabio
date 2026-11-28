package br.com.impacta.prateleiradigital.testes;

import java.util.List;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteCatalogo {
	public static void main(String[] args) {

		/*
		 * 1 - Cadastrar Filme 2 - Listar Filme 3 - Atualizar Filme 4 - Excluir Filme 0
		 * - Sair
		 * 
		 */

		// Instanciar a classe Controller
		FilmeController controller = new FilmeController();

		// try with resources para gerenciamento do Scanner
		try (
				// Instanciar a classe Scanner
				Scanner scanner = new Scanner(System.in);

		) {

			while (true) {
				System.out.println("\n===PRATELEIRA DIGITAL===");
				System.out.println("1 - Cadastrar Filme");
				System.out.println("2 - Listar Filme");
				System.out.println("3 - Atualizar Filme");
				System.out.println("4 - Excluir Filme");
				System.out.println("0 - Sair");
				System.out.println("Escolha uma opção: ");

				String opcao = scanner.nextLine().trim();

				switch (opcao) {
				case "1": {
					System.out.println("\n===CADASTRAR FILME===");
					Filme filme = new Filme();
					System.out.println("\nDigite o título do filme: ");
					filme.setTitulo(scanner.next());
					System.out.println("\nDigite os diretores do filme: ");
					filme.setDiretores(scanner.next());
					System.out.println("\nDigite a nota do filme: ");
					filme.setNota(Double.parseDouble(scanner.next()));
					System.out.println("\nDigite a duração do filme: ");
					filme.setDuracao(Integer.parseInt(scanner.next()));
					System.out.println("\nDigite o ano do filme: ");
					filme.setAno(Integer.parseInt(scanner.next()));
					System.out.println("\nDigite o gênero do filme: ");
					filme.setGeneros(scanner.next());
					System.out.println("\nDigite o número de votos do filme: ");
					filme.setNumVotos(Integer.parseInt(scanner.next()));
					System.out.println("\nDigite a url do filme: ");
					filme.setUrl(scanner.next());

					if (controller.cadastroDeFilme(filme) == 1) {
						System.out.println("\n Filme cadastrado com SUCESSO!");

					} else {
						System.out.println("\n Ocorreu um erro no cadastro!");

					}
					break;
				}
				case "2": {
					System.out.println("\n===LISTA DE FILMES===");
					System.out.println("\n");
					List<Filme> filmes = controller.listaDeFilmes();

					System.out.print("| ID | TÍTULO | DIRETORES | NOTA | DURAÇÃO | ANO | GÊNEROS | Nº VOTOS | WWW\n");

					for (Filme f : filmes) {
						System.out.print(" | " + f.getId() + " | ");
						System.out.print(f.getTitulo());
						System.out.print(" | " + f.getDiretores());
						System.out.print(" | " + f.getNota());
						System.out.print(" | " + f.getDuracao());
						System.out.print(" | " + f.getAno());
						System.out.print(" | " + f.getGeneros());
						System.out.print(" | " + f.getNumVotos());
						System.out.print(" | " + f.getUrl() + " | ");

						System.out.println("\n");
					}
					break;
				}
				case "3": {
					System.out.println("\n===ATUALIZANDO FILMES===");
					System.out.println("\n===FILMES DISPONÍVEIS===");
					List<Filme> filmes = controller.listaDeFilmes();

					System.out.println("\n| ID | TÍTULO |");
					for (Filme f : filmes) {
						System.out.print(" | " + f.getId() + " | ");
						System.out.print(f.getTitulo());
						System.out.print("\n");

					}
					System.out.println("\n===ESCOLHA UMA OPÇÃO===");

					// Capturando a opção de filme do usuário
					int id = Integer.parseInt(scanner.nextLine().trim());

					// Procure na lista

					Filme selecionado = null;
					for (Filme f : filmes) {
						if (f.getId() == id) {
							selecionado = f;
							break;
						}
					}

					// Se o filme selecionado estiver null sai do menu
					if (selecionado == null) {
						System.out.println("\n FILME NÃO ENCONTRADO!");
						break;
					}

					// Realizando a alteração no atributo título no objeto selecionado
					System.out.println("\n NOVO TÍTULO: ");
					selecionado.setTitulo(scanner.nextLine());

					if (controller.atualizaFilme(id, selecionado) == 1) {
						System.out.println("\n FILME ATUALIZADO COM SUCESSO!");

					} else {
						System.out.println("\n NENHUM FILME FOI ATUALIZADO!!!");
					}

					break;
				}
				case "4": {

					System.out.println("\n===EXCLUIR FILME===");

					List<Filme> filmes = controller.listaDeFilmes();

					System.out.println("\n| ID | TÍTULO |");
					for (Filme f : filmes) {
						System.out.print(" | " + f.getId() + " | ");
						System.out.print(f.getTitulo());
						System.out.print("\n");

					}
					System.out.println("\n===SELECIONE O ID DO FILME QUE DESEJA EXCLUIR===");

					// Capturando a opção de filme do usuário
					int id = Integer.parseInt(scanner.nextLine().trim());

					// Procure na lista

					Filme selecionado = null;
					for (Filme f : filmes) {
						if (f.getId() == id) {
							selecionado = f;
							break;
						}
					}

					// Se o filme selecionado estiver null sai do menu
					if (selecionado == null) {
						System.out.println("\n FILME NÃO ENCONTRADO!");
						break;
					}

					if (controller.excluirFilme(id) == 1) {
						System.out.println("\n FILME EXCLUÍDO COM SUCESSO!");

					} else {
						System.out.println("\n NENHUM FILME FOI EXCLUÍDO!");
					}

					break;
				}
				case "0": {
					scanner.close();
					return;
				}

				default:

				}
			}

		} catch (Exception e) {

		}
	}

}