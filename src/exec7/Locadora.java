package exec7;

import javax.swing.JOptionPane;

/**
 * Classe Locadora
 * 
 * @author jaraujo
 * @since 13/02/2020
 * @version 0.1
 */

public class Locadora {

	static Carro vetorCarro[];

	public static void busca() {
		int escolha;
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe o qual a forma de busca: \n 1- para buscar por modelo \n 2 - para buscar por velocidade \n 3 - para buscar por combustivel \n 4 - para buscar por Cor \n 5 - para exibir um relatório em Ordem Descrecente \n 6 - para compra \n 9 - finalizar"));
			switch (escolha) {
			case 1:
				buscaModelo();
				break;
			case 2:
				buscaVelocidade();
				break;
			case 3:
				buscaCombustivel();
				break;
			case 4:
				buscaCor();
				break;
			case 5:
				exibirValoresOrdemDecrescente();
				break;
			case 6:
				compra();
			case 9:
//		default:
//			JOptionPane.showMessageDialog(null, "Código Inválido", "Erro", JOptionPane.ERROR_MESSAGE);

			}

		} while (escolha != 9);
	}

	public static void buscaModelo() {

		boolean verificaRegistros = false;

		String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloDoCarro.toUpperCase().equals(modelo)) {

				System.out.println("Modelo do carro: " + vetorCarro[i].modeloDoCarro);
				System.out.println("Placa: " + vetorCarro[i].placaDoCarro);
				System.out.println("Velocidade máxima: " + vetorCarro[i].velocidadeMaxima);
				System.out.println("Tipo de combustível: " + vetorCarro[i].combustivel);
				System.out.printf("Valor do carro: %.3f ", vetorCarro[i].valor);
				System.out.println("Cor do carro: " + vetorCarro[i].cor);

				System.out.print("\n");

				verificaRegistros = true;

			}
		}

		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		}

	}

	public static void buscaVelocidade() {

		boolean verificaRegistros = false;

		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do carro: "));
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMaxima == velocidade) {

				System.out.println("Modelo do carro: " + vetorCarro[i].modeloDoCarro);
				System.out.println("Placa: " + vetorCarro[i].placaDoCarro);
				System.out.println("Velocidade máxima: " + vetorCarro[i].velocidadeMaxima);
				System.out.println("Tipo de combustível: " + vetorCarro[i].combustivel);
				System.out.printf("Valor do carro: %.3f ", vetorCarro[i].valor);
				System.out.println("Cor do carro: " + vetorCarro[i].cor);

				System.out.println("\n");

				verificaRegistros = true;
			}

		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		}
	}

	public static void buscaCombustivel() {

		boolean verificaRegistros = false;

		String combustivel = JOptionPane.showInputDialog("Informe o tipo de combustível do carro: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.toUpperCase().equals(combustivel)) {

				System.out.println("Modelo do carro: " + vetorCarro[i].modeloDoCarro);
				System.out.println("Placa: " + vetorCarro[i].placaDoCarro);
				System.out.println("Velocidade máxima: " + vetorCarro[i].velocidadeMaxima);
				System.out.println("Tipo de combustível: " + vetorCarro[i].combustivel);
				System.out.printf("Valor do carro: %.3f ", vetorCarro[i].valor);
				System.out.println("Cor do carro: " + vetorCarro[i].cor);

				System.out.println("\n");

				verificaRegistros = true;
			}

		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		}
	}

	public static void exibirValoresOrdemDecrescente() {

		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {
					Carro aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
				}
			}
		}

		for (int i = 0; i < vetorCarro.length; i++) {

			System.out.println("Modelo do carro: " + vetorCarro[i].modeloDoCarro);
			System.out.println("Placa: " + vetorCarro[i].placaDoCarro);
			System.out.println("Velocidade máxima: " + vetorCarro[i].velocidadeMaxima);
			System.out.println("Tipo de combustível: " + vetorCarro[i].combustivel);
			System.out.printf("Valor do carro: %.3f \n", vetorCarro[i].valor);
			System.out.println("Cor do carro: " + vetorCarro[i].cor);

			System.out.println("");

		}

	}

	public static void exibirValoresOrdemCrescente() {

		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {
					Carro aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
				}
			}
		}

	}

	public static void buscaCor() {

		boolean verificaRegistros = false;

		String cor = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.toUpperCase().equals(cor)) {

				System.out.println("Modelo do carro: " + vetorCarro[i].modeloDoCarro);
				System.out.println("Placa: " + vetorCarro[i].placaDoCarro);
				System.out.println("Velocidade máxima: " + vetorCarro[i].velocidadeMaxima);
				System.out.println("Tipo de combustível: " + vetorCarro[i].combustivel);
				System.out.printf("Valor do carro: %.3f \n", vetorCarro[i].valor);
				System.out.println("Cor do carro: " + vetorCarro[i].cor);

				System.out.print("\n");

				verificaRegistros = true;

			}
		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");

		}
	}

	public static void compra() {
		
		String todosCarros = " ";
		int contCarro = 1;

		boolean verificaRegistros = false;

		String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ").toUpperCase();
		String cor = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();
		
		exibirValoresOrdemCrescente();
		
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloDoCarro.toUpperCase().equals(modelo)
					&& vetorCarro[i].cor.toUpperCase().equals(cor)) {
				
				// Verifica se existe o carro pesquisado pelo usuário e atribui a String todosCarros e repete e concatena caso já existe algum valor atribuído a String todosCarros. 
				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + " \n Modelo do carro: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: " + vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n" + "Cor do carro: " + vetorCarro[i].cor;
				
				System.out.print("\n");

				verificaRegistros = true;

			}
		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}

	}

	public static void main(String[] args) {

		vetorCarro = new Carro[10];

		Carro carro1 = new Carro("Gol", "HUJ-5871", 150, "Gasolina", 8.000, "Vinho");
		Carro carro2 = new Carro("Kadetti", "BHY-1002", 140, "Gasolina", 6.000, "Azul");
		Carro carro3 = new Carro("Corsa", "NPG-4587", 160, "Alcool", 7.000, "Prata");
		Carro carro4 = new Carro("Meriva", "FAW-3003", 180, "Gasolina", 8.000, "Preta");
		Carro carro5 = new Carro("Celta", "LOP-0001", 120, "Gasolina", 9.000, "Vermelho");
		Carro carro6 = new Carro("ix35", "RTY-9047", 220, "Flex", 40.000, "Prata");
		Carro carro7 = new Carro("hb20", "PLM-4589", 200, "Flex", 30.000, "Branco");
		Carro carro8 = new Carro("i30", "MLP-9485", 210, "Flex", 20.000, "Preto");
		Carro carro9 = new Carro("i30", "UCZ-2314", 280, "Flex", 60.000, "Preto");
		Carro carro10 = new Carro("Corolla", "PKQ-8301", 240, "Flex", 90.000, "Prata");

		vetorCarro[0] = carro1;
		vetorCarro[1] = carro2;
		vetorCarro[2] = carro3;
		vetorCarro[3] = carro4;
		vetorCarro[4] = carro5;
		vetorCarro[5] = carro6;
		vetorCarro[6] = carro7;
		vetorCarro[7] = carro8;
		vetorCarro[8] = carro9;
		vetorCarro[9] = carro10;

		busca();

	}
}
