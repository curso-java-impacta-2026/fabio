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
	
	@Override
	public void falar(String fala) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
