package br.com.impacta.cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

//		ExemploThrows exth = new ExemploThrows();
//
//		try {
//			exth.metodo1();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//

		// A classe Scanner pertence ao Java Útil e é
		// responsável por capturar a entrada de dados
		// do usuário através do console.

		Scanner scan = new Scanner(System.in);

//		String nome = "";
//
//		System.out.println("DIGITE SEU NOME!");
//		nome = scan.next();
//
//		System.out.println("O nome digitado foi: " + nome);
//
//		// fechando o SCANNER
//		scan.close();

		// Criando uma calculadora simples:

		int nr1 = 0;
		int nr2 = 0;

		try {

			System.out.println("Digite o primeiro número da SOMA:");
			nr1 = scan.nextInt();

			System.out.println("Digite o segundo número da SOMA:");
			nr2 = scan.nextInt();

			System.out.println("O resultado da SOMA é: " + (nr1 + nr2));

		} catch (InputMismatchException e) {

			System.out.println("Digite apenas números!!!");
		} finally {
			scan.close();
		}

	}

}
