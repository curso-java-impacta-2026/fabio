package br.com.impacta.prateleiradigital.negocio;

public class Filme {

	private String titulo;
	private String diretores;
	private double nota;
	private int duracao;
	private int ano;
	private String generos;
	private int numDeVotos;
	private String url;

	public Filme() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titulo
	 * @param diretores
	 * @param nota
	 * @param duracao
	 * @param ano
	 * @param generos
	 * @param numDeVotos
	 * @param url
	 */
	public Filme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numDeVotos,
			String url) {
		super();
		this.titulo = titulo;
		this.diretores = diretores;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.generos = generos;
		this.numDeVotos = numDeVotos;
		this.url = url;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the diretores
	 */
	public String getDiretores() {
		return diretores;
	}

	/**
	 * @param diretores the diretores to set
	 */
	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}

	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}

	/**
	 * @return the duracao
	 */
	public int getDuracao() {
		return duracao;
	}

	/**
	 * @param duracao the duracao to set
	 */
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the generos
	 */
	public String getGeneros() {
		return generos;
	}

	/**
	 * @param generos the generos to set
	 */
	public void setGeneros(String generos) {
		this.generos = generos;
	}

	/**
	 * @return the numDeVotos
	 */
	public int getNumDeVotos() {
		return numDeVotos;
	}

	/**
	 * @param numDeVotos the numDeVotos to set
	 */
	public void setNumDeVotos(int numDeVotos) {
		this.numDeVotos = numDeVotos;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
