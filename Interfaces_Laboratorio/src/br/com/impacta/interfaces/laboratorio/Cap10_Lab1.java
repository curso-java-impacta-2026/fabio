package br.com.impacta.interfaces.laboratorio;

public class Cap10_Lab1 {

	public static void main(String[] args) {
		
		Imprimivel imprimivel;
		
		imprimivel = new Relatorio();
		imprimivel.imprimir();
		
		imprimivel = new Grafico();
		imprimivel.imprimir();
		

	}

}
