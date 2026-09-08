package br.com.impacta.laboratorio1;

public class RG {
	
	private int numero;
	private String dataNasc;
	
		
	//Criando os construtores
	
	public RG(int numero, String dataNasc){
		this.numero = numero;
		this.dataNasc = dataNasc;
	}
	
//	RG(int numero, String dataNasc) {
//		super();
//		this.numero = numero;
//		this.dataNasc = dataNasc;
//			
//	}
//		
//	private RG() {
//		super();
//		
//	}

    //Criando getter e setters
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}
