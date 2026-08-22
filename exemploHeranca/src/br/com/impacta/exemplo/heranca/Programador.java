package br.com.impacta.exemplo.heranca;

public class Programador extends Funcionario {
	
	private String linguagem;

	//Construtor padrão
	public Programador() {
		super();
		// TODO Auto-generated constructor stub
	}
    //Construtor full local
	public Programador(String linguagem) {
		super();
		this.linguagem = linguagem;
	}
	
	//Construtor full SUPER()
	public Programador(String linguagem, String nome, double salario) {
		super(nome, salario);
		this.linguagem = linguagem;
	}


	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

		
	

}
