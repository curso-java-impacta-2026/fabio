package br.com.impacta.cap16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploFiles {

	public static void main(String[] args) {

		try {

			Path arquivo = Paths.get("D:\\205\\fabio\\exemplo3\\resources\\poema.txt");
			Path novaPasta = Paths.get("D:\\205\\fabio\\exemplo3\\resources\\textos\\rascunhos\\vazio");
			Path pasta = Paths.get("C:\\Meus Documentos\\Mp3");

			if (Files.exists(arquivo)) {
				System.out.println("O item não existe.");
			} else if (Files.isDirectory(arquivo)) {
				System.out.println("O item é um diretório.");
			} else if (Files.isRegularFile(arquivo)) {
				System.out.println("O item é um arquivo.");
			} else {
				Files.createFile(arquivo);
				Files.createDirectories(novaPasta);
				Files.createDirectories(pasta);
			}

			/* Exibe */
			System.out.println(Files.size(arquivo));

			/* Cria o diret�rio rascunhos. */
			Files.createDirectories(novaPasta);

			/* Exibe o conteúdo do diretório Mp3 */
			Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
