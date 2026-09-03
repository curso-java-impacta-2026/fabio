package br.com.impacta.laboratorio1;

public class Cap9_Lab1 {

	public static void main(String[] args) {
		
		//Criando os objetos
		
		Pessoa p = new Professor("Rafael", 38, 'M', 261454789, "05/02/1974", 2500.0f, "Português");
		
		Pessoa aluno1 = new Aluno("Manuel", 19, 'M', 521234567, "15/06/1993", 1099.0f, 
				"Ciência da Computação");
		
		Pessoa aluno2 = new Aluno("Cláudia", 20, 'F', 123456789, "10/10/1992", 1099.0f, 
				"Ciência da Computação");

		//Método falar
		
		p.falar("Manuel?");
		aluno1.falar("Presente");
		p.falar("Cláudia?");
		aluno2.falar("Presente");
		
		System.out.println();
		
		//Mostrar os dados
		
		p.mostrarDados();
		
		System.out.println();
		
		aluno1.mostrarDados();
		
		System.out.println();
		
		aluno2.mostrarDados();
		
		
		
	}

}
