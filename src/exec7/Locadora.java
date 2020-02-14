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

	static boolean exit = false;

	public static void buscarModelo() {

		String todosCarros = " ";

		boolean verificaRegistros = false;

		String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloDoCarro.toUpperCase().equals(modelo)) {

				todosCarros = todosCarros + " \n\n Modelo do carro: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "
						+ vetorCarro[i].placaDoCarro + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima
						+ "\n" + "Tipo de combustível: " + vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ "
						+ vetorCarro[i].valor + "\n" + "Cor do carro: " + vetorCarro[i].cor;

				verificaRegistros = true;

			}
		}

		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}

	public static void buscarVelocidade() {

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do carro: "));
		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velocidadeMaxima == velocidade) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + " \n Modelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor;

				System.out.println("\n");

				verificaRegistros = true;
			}

		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}

	public static void buscarCombustivel() {

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		String combustivel = JOptionPane.showInputDialog("Informe o tipo de combustível do carro: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.toUpperCase().equals(combustivel)) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + " \n Modelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor;

				System.out.println("\n");

				verificaRegistros = true;
			}

		}
		if (!verificaRegistros) {
			JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null, todosCarros);
		}
	}

	public static void exibirValoresOrdemDecrescente() {

		String todosCarros = " ";

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

			todosCarros = todosCarros + " \n\n Modelo do carro: " + vetorCarro[i].modeloDoCarro + "\n" + "Placa: "
					+ vetorCarro[i].placaDoCarro + "\n" + "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n"
					+ "Tipo de combustível: " + vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ "
					+ vetorCarro[i].valor + "\n" + "Cor do carro: " + vetorCarro[i].cor;

		}

		JOptionPane.showMessageDialog(null, todosCarros);

	}

	public static void repeticao() {
		while (!exit) {
			processar();
		}
	}

	public static void processar() {
		
		while (!exit)
		try {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe qual a forma de busca: \n 1 - para buscar por modelo \n 2 - para buscar por velocidade \n 3 - para buscar por combustivel \n 4 - para buscar por Cor \n 5 - para exibir um relatório em Ordem Descrecente \n 6 - para compra \n 9 - finalizar"));

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

		String todosCarros = " ";
		int contCarro = 1;
		boolean verificaRegistros = false;

		String cor = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.toUpperCase().equals(cor)) {

				todosCarros = todosCarros + " \n Carro Nº " + contCarro++ + " \n Modelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ "Cor do carro: " + vetorCarro[i].cor;

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

	public static void comprarCarro() {
		
		int aux = 1;
		String todosCarros = " ";
		Carro contCarro[] = new Carro[30];
		boolean vendido;
		boolean verificaRegistros = false;

		String modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ").toUpperCase();
		String cor = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();

		exibirValoresOrdemCrescente();

		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloDoCarro.toUpperCase().equals(modelo)
					&& vetorCarro[i].cor.toUpperCase().equals(cor)) {
				
				contCarro[aux] = vetorCarro[i];
				
				
				verificaRegistros = true;
				
				// Verifica se existe o carro pesquisado pelo usuário e atribui a String
				// todosCarros e repete e concatena caso já existe algum valor atribuído a
				// String todosCarros.
			todosCarros = todosCarros + " \n Carro Nº " + aux + " \n Modelo do carro: "
						+ vetorCarro[i].modeloDoCarro + "\n" + "Placa: " + vetorCarro[i].placaDoCarro + "\n"
						+ "Velocidade máxima: " + vetorCarro[i].velocidadeMaxima + "\n" + "Tipo de combustível: "
						+ vetorCarro[i].combustivel + "\n" + "Valor do carro: R$ " + vetorCarro[i].valor + "\n"
						+ " \n Cor do carro: " + vetorCarro[i].cor;
			
			aux++;
			}
		}
	
			 
	if(!verificaRegistros)
				{
					JOptionPane.showMessageDialog(null, "O carro informado não existe ou ainda não foi cadastrado");
				}else
				{
					
					String opcaoCompra = "";
					JOptionPane.showMessageDialog(null, todosCarros);
					JOptionPane.showInputDialog("Deseja comprar o carro? (S/N)").toUpperCase();
					if (opcaoCompra.equals("S")) {
						int opcaoCarroCompra = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do carro que deseja comprar: "));
						if(opcaoCarroCompra == aux){
							double valorPago Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
							if(contCarro[aux].valor > valorPago) {
								
							}
							
						}
					}
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

		processar();

	}
}
