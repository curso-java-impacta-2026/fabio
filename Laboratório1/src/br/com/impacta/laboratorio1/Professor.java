package br.com.impacta.laboratorio1;

public class Professor extends Pessoa {
	
	private float salario;
	private String disciplina;
	
	//Criando os métodos get e set	
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	//Criando o construtor recebendo os parâmetros
	
	public Professor(String nome, int idade, char sexo, int numeroRG, 
			String dataNasc, float salario, String disciplina) {
		
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
	
	//Atribuir os parâmetros a seus atributos
		
		this.salario = salario;
		this.disciplina = disciplina;
	}
	
	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ": " + fala);		
		
	}
		
	@Override
	public void mostrarDados() {
		
		System.out.println("--- Professor: " + getNome() + "---");
		
		System.out.println("Idade: " + getIdade());
		
		System.out.println("Sexo: " + getSexo());
		
		System.out.println("Número RG: " + getRg().getNumero());
		
		System.out.println("Data de Nascimento: " + getRg().getDataNasc());
		
		System.out.println("Salário: " + salario);
		
		System.out.println("Disciplina: " + disciplina);
		
		
	}
	
	

}
