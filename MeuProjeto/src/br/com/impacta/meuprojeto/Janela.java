package br.com.impacta.meuprojeto;

public class Janela implements Acesso{

	@Override
	public void abrir() {
		System.out.println("Favor, abrir a janela!");
		
	}

	@Override
	public void fechar() {
		System.out.println("Favor, fechar a janela!");
		
	}
	

}
