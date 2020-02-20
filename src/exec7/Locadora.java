package exec7;

import javax.swing.JOptionPane;

/**
 * Classe Locadora responsável por testar a classe Carro, para pesquisa por modelos, velocidades, tipo de combustíveis
 * e compra de carros.
 * 
 * @author jaraujo
 * @since 13/02/2020
 * @version 0.1
 */

public class Locadora {

	static Carro vetorCarro[];

	boolean exit = false;

	public Locadora() {
		processar();
	}

	// Método para buscar os carros pelo modelo
	public void buscarModelo() {

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloDoCarro.toUpperCase().equals(modelo)) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + "\n\nModelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor + "\n";

				verificaRegistros = true;

			}
		}

		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}
	
	// Método para buscar os carros pela velocidade
	public void buscarVelocidade() {

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do carro: "));
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMaxima == velocidade) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + "\n\nModelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor + "\n";

				

				verificaRegistros = true;
			}

		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}

	// Método para buscar os carros pelo tipo de combustível
	public void buscarCombustivel() {

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		String combustivel = JOptionPane.showInputDialog("Informe o tipo de combustível do carro: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.toUpperCase().equals(combustivel)) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + "\n\nModelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor + "\n";
				

				verificaRegistros = true;
			}

		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}
	
	// Método para ordenar os carros em Ordem Descrescente 
	public void exibirValoresOrdemDecrescente() {

		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {
					Carro aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
				}
			}
		}

		String todosCarros = "";

		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].vendido == false) {	
			todosCarros = todosCarros + " \n\nModelo do carro: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "
					+ vetorCarro[i].placaDoCarro + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n"
					+ "Tipo de combustível: " + vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ "
					+ vetorCarro[i].valor + "\n" + "Cor do carro: " + vetorCarro[i].cor + "\n";
			
			}

		}

		JOptionPane.showMessageDialog(null, todosCarros);
	}
	
	// Método para repetir até que o usuário digite 9
	public void repeticao() {
		while (!exit) {
			processar();
		}
	}
	
	// Método para processar todo o programa
	public void processar() {

		while (!exit)
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"Informe qual a forma de busca: \n 1 - para buscar por modelo \n 2 - para buscar por velocidade \n 3 - para buscar por combustivel \n 4 - para buscar por Cor \n 5 - para exibir um relatório em Ordem Descrecente \n 6 - para compra \n 7 - para incluir carros \n 9 - finalizar"));

				switch (opcao) {
				case 1:
					buscarModelo();
					break;
				case 2:
					buscarVelocidade();
					break;
				case 3:
					buscarCombustivel();
					break;
				case 4:
					buscaCor();
					break;
				case 5:
					exibirValoresOrdemDecrescente();
					break;
				case 6:
					comprarCarro();
					break;
				case 7:
					incluirCarro();
					break;
				case 9:
					exit = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada Inválida, Entre apenas com números", "Erro",
						JOptionPane.ERROR_MESSAGE);
				processar();
			}

	}

	// Método para ordenar os carros em Ordem Crescente 
	public void exibirValoresOrdemCrescente() {

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

	// Método para buscar os carros pela cor
	public void buscaCor() {

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		String cor = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.toUpperCase().equals(cor)) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + " \n\nModelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor + "\n";


				verificaRegistros = true;

			}
		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}

	// Método para comprar carros e diminuir o estoque
	public void comprarCarro() {

		int aux = 0;
		String todosCarros = " ";
		Carro contCarro[] = new Carro[5];
		boolean verificaRegistros = false;

		String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ").toLowerCase();
		String cor = JOptionPane.showInputDialog("Informe a cor do carro: ").toLowerCase();

		exibirValoresOrdemCrescente();

		for (int i = 0; i < vetorCarro.length; i++) {
			if ((vetorCarro[i].modeloDoCarro.toLowerCase().equals(modelo))
					&& (vetorCarro[i].cor.toLowerCase().equals(cor)) && !(vetorCarro[i].vendido)) {

				contCarro[aux] = vetorCarro[i];

				verificaRegistros = true;

				// Verifica se existe o carro pesquisado pelo usuário e atribui a String
				// todosCarros e repete e concatena caso já existe algum valor atribuído a
				// String todosCarros.
				todosCarros = todosCarros + " \nCarro Nº " + aux + " \n\nModelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor
						+ " \nCor do carro: " + vetorCarro[i].cor + "\n";

				aux++;
			}
		}

		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else

		{
			JOptionPane.showMessageDialog(null, todosCarros);
			int opcaoCarroCompra = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o número do carro que deseja comprar: "));
			double valorPago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
			if (valorPago >= contCarro[opcaoCarroCompra].valor) {
				double troco = valorPago - contCarro[opcaoCarroCompra].valor;
				JOptionPane.showMessageDialog(null, "Carro comprado com êxito, seu troco é: " + troco);
				contCarro[opcaoCarroCompra].vendido = true;
				for (int i = 0; i < contCarro.length; i++) {
					if (contCarro[i] != null) {
						if (contCarro[i].vendido) {
						vetorCarro[i].vendido = true;
						}
					}
				}

			}

			else {
				JOptionPane.showMessageDialog(null, "Você não possui dinheiro suficiente para comprar esse carro");

			}

		}
		
		exibirValoresOrdemDecrescente();
	}

	// Método para incluir carros no sistema
	public void incluirCarro() {
		for (int i = 10; i < 20; i++) {
			if (vetorCarro[i] != null) {
				Carro novoCarro = new Carro(
						JOptionPane.showInputDialog("Informe o modelo do carro que deseja incluir: "),
						JOptionPane.showInputDialog("Informe a placa do carro que deseja incluir: "),
						Integer.parseInt(
								JOptionPane.showInputDialog("Informe a velocidade máxima que deseja incluir: ")),
						JOptionPane.showInputDialog("Informe o tipo de combustivel do carro que deseja incluir"),
						Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro que deseja incluir")),
						JOptionPane.showInputDialog("Informe a cor do carro que deseja incluir"), false);

				vetorCarro[i] = novoCarro;
			}
			String escolha = JOptionPane.showInputDialog("Deseja incluir mais um carro? (S/N)").toUpperCase();
			if (!escolha.equals("S")) {
				break;
			}
		}

	}

	public static void main(String[] args) {

		vetorCarro = new Carro[20];

		Carro carro1 = new Carro("GOL", "HUJ-5871", 150, "GASOLINA", 8.000, "VINHO", false);
		Carro carro2 = new Carro("GOL", "BHY-1002", 200, "GASOLINA", 6.000, "VINHO", false);
		Carro carro3 = new Carro("CORSA", "NPG-4587", 160, "ALCOOL", 7.000, "PRATA", false);
		Carro carro4 = new Carro("MERIVA", "FAW-3003", 180, "GASOLINA", 8.000, "PRETA", false);
		Carro carro5 = new Carro("CELTA", "LOP-0001", 120, "GASOLINA", 9.000, "VERMELHO", false);
		Carro carro6 = new Carro("IX35", "RTY-9047", 220, "FLEX", 40.000, "PRATA", false);
		Carro carro7 = new Carro("HB20", "PLM-4589", 200, "FLEX", 30.000, "BRANCO", false);
		Carro carro8 = new Carro("I30", "MLP-9485", 200, "FLEX", 20.000, "PRETO", false);
		Carro carro9 = new Carro("I30", "UCZ-2314", 280, "FLEX", 60.000, "PRETO", false);
		Carro carro10 = new Carro("COROLLA", "PKQ-8301", 240, "FLEX", 90.000, "PRATA", false);

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

		for (int i = 10; i < 20; i++) {
			if (vetorCarro[i] == null) {
				Carro novoCarro = new Carro(" ", " ", 0, " ", 0.0, " ", false);
				vetorCarro[i] = novoCarro;
			}

		}

		new Locadora();

	}
}
