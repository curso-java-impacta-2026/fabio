package br.com.impacta.cap14;

public class Soma implements OperacaoAritmetica {

	@Override
	public double execute(double value1, double value2) {
		double result = value1 + value2;
		return result;
	}
}
