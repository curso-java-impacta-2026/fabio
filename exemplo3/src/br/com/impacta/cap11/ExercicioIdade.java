package br.com.impacta.cap11;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {

		// Através da classe Scanner, método nextLine(), solicite ao usuário que digite
//		o ano de seu nascimento, atribuindo o valor digitado a uma variável de tipo 
//		string;

		Scanner scan = new Scanner(System.in);

		String anoNasc = "";

		System.out.println("Digite o ano do seu nascimento com 4 dígitos: YYYY");

		try {
			anoNasc = scan.nextLine();

			int valorConvertido = Integer.parseInt(anoNasc);

			System.out.println("O usuário tem: " + (2026 - valorConvertido));

		} catch (NumberFormatException e) {
			System.out.println("Valor digitado inválido!");

		} finally {
			scan.close();
		}

	}

	// Utilize o método Integer.parseInt() para converter o valor inserido
//	anteriormente para numérico e atribua este valor convertido a uma variável 
//	int

}
