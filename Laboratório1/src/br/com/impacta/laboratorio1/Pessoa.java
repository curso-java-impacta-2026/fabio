package br.com.impacta.laboratorio1;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	private RG rg;
	
	
	
	private Pessoa(String nome, int idade, char sexo, RG rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public RG getRg() {
		return rg;
	}
	
	public void setRg(RG rg) {
		this.rg = rg;
	}
	
	public abstract void falar(String fala);
	public abstract void mostrarDados();
	
	
	
	

}