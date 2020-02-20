package exec7;

/**
 * Classe Carro, seus atributos, com método construtor vazio e método construtor preenchido.
 * @author jaraujo
 * @since 13/02/2020
 * @version 0.1
 */

public class Carro {

	String modeloDoCarro;
	String placaDoCarro;
	int velocidadeMaxima;
	String combustivel;
	double valor;
	String cor;
	boolean vendido = false;

	public Carro() {

	}

	public Carro(String modeloDoCarro, String placaDoCarro, int velocidadeMaxima, String combustivel, double valor, String cor, boolean vendido) {
		this.modeloDoCarro = modeloDoCarro;
		this.placaDoCarro = placaDoCarro;
		this.velocidadeMaxima = velocidadeMaxima;
		this.combustivel = combustivel;
		this.valor = valor;
		this.cor = cor;
		this.vendido = vendido;
	}



	

}
