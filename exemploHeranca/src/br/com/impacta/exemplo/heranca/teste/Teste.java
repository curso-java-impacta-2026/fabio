package br.com.impacta.exemplo.heranca.teste;

import br.com.impacta.exemplo.heranca.Programador;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Utilizando o construtor padrão
		//Programador p = new Programador();
		
		//Utilizando o construtor super
		Programador p = new Programador("Java","Joaquim", 3.678);
		
		
		//Atribuindo ao programador os atributos herdados
//		p.setNome("José");
//		p.setSalario(2.567);
//		p.setLinguagem("Java");
		
		System.out.println("Dados do programador: ");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Salário: R$ " + p.getSalario());
		System.out.println("Linguagem: " + p.getLinguagem());

	}

}
