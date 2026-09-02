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
	
	@Override
	public void falar(String fala) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}
	
	

}
