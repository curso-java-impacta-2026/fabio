package br.com.impacta.laboratorio1;

public class Aluno extends Pessoa {
	
	private float mensalidade;
	private String curso;
	
	//Criando os métodos get e setter
	
	
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//Criando o construtor para receber os parâmetros
	
	public Aluno(String nome, int idade, char sexo, int numeroRG, 
			String dataNasc, float mensalidade, String curso) {
		
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
	
	//Atribuir os parâmetros a seus atributos
		
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	
	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ": " + fala);		
		
	}
		
	@Override
	public void mostrarDados() {
		
		System.out.println("--- Aluno: " + getNome() + "---");
		
		System.out.println("Idade: " + getIdade());
		
		System.out.println("Sexo: " + getSexo());
		
		System.out.println("Número RG: " + getRg().getNumero());
		
		System.out.println("Data de Nascimento: " + getRg().getDataNasc());
		
		System.out.println("Mensalidade: " + mensalidade);
		
		System.out.println("Curso: " + curso);
		
	}
	
	

}
