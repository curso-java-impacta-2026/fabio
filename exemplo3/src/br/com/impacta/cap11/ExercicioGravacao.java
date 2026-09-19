package br.com.impacta.cap11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

	public static void main(String[] args) {

		// Dentro do método main, solicite que o usuário digite uma frase qualquer,
		// utilizando o método nextLine() da classe Scanner;

		Scanner scan = new Scanner(System.in);
		String fraseQualquer = "";

		// Utilize o código a seguir para gravar a mensagem digitada em um arquivo
//		texto, em que a variável texto é aquela que foi utilizada no passo anterior para 
//		obter a mensagem digitada pelo usuário

		PrintWriter writer;

		try {

			System.out.println("Digite uma frase qualquer");
			fraseQualquer = scan.nextLine();

			writer = new PrintWriter("D:\\205\\fabio\\doc1.txt");
			writer.println(fraseQualquer);
			writer.close();

		} catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas");

		} finally {
			scan.close();
		}
	}

}
