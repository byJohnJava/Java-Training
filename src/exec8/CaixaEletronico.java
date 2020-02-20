package exec8;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar o fluxo de saque de um caixa eletrônico com
 * notas de 2, 5, 10, 20 e 50
 * 
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

public class CaixaEletronico {// inicio da classe

	static int notaCinquenta = 0;
	static int notaVinte = 0;
	static int notaDez = 0;
	static int notaCinco = 0;
	static int notaDois = 0;

	public static void processar() {

		int valorSacado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Calculadora", 1));

		// Inicio dos condicionais para calculo de notas
		if (valorSacado <= 0) {
			JOptionPane.showMessageDialog(null, "Não é possível sacar zero ou negativo");
		}
		if (valorSacado == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 103);
			exibeTodasNotas();
		}
		if (valorSacado == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 53);
			exibeTodasNotas();
		} else if (valorSacado >= 50) {
			notaCinquenta = (valorSacado / 50);
			valorSacado = (valorSacado - (notaCinquenta * 50));
			exibeTodasNotas();
		}
		if (valorSacado == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 43);
			exibeTodasNotas();
		}
		if (valorSacado == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 23;
			exibeTodasNotas();
		} else if (valorSacado >= 20) {
			notaVinte = (valorSacado / 20);
			valorSacado = (valorSacado - (notaVinte * 20));
			exibeTodasNotas();
		} else if (valorSacado >= 10) {
			notaDez = (valorSacado / 10);
			valorSacado = (valorSacado - (notaDez * 10));
			exibeTodasNotas();
		} else if (valorSacado >= 2) {
			notaDois = (valorSacado / 2);
			valorSacado = (valorSacado - (notaDois * 2));
			exibeTodasNotas();

		} else if (valorSacado >= 5) {
			notaCinco = (valorSacado / 5);
			valorSacado = (valorSacado - (notaCinco * 5));
			exibeTodasNotas();
			

			switch (valorSacado) {

			case 17:
				notaCinco = 3;
				notaDois = 1;
				exibeTodasNotas();
				break;
			case 13:
				notaCinco = 1;
				notaDois = 4;
				exibeTodasNotas();
				break;
			case 11:
				notaCinco = 1;
				notaDois = 3;
				exibeTodasNotas();
				break;
			case 9:
				notaCinco = 1;
				notaDois = 2;
				exibeTodasNotas();
				break;
			case 8:
				notaDois = 4;
				exibeTodasNotas();
				break;
			case 7:
				notaCinco = 1;
				notaDois = 1;
				exibeTodasNotas();
				break;
			case 6:
				notaDois = 3;
				exibeTodasNotas();
				break;
			case 5:
				notaCinco = 1;
				exibeTodasNotas();
				break;
			case 4:
				notaDois = 2;
				exibeTodasNotas();
				break;
			case 3:
				notaDois = 1;
				exibeTodasNotas();
				break;
			case 2:
				notaDois = 1;
				exibeTodasNotas();
				break;
			}
		}
	}

	public static void main(String[] args) {// inicio do método main

		try {
			processar();

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Entrada Inválida, Entre apenas com números", "Erro",
					JOptionPane.ERROR_MESSAGE);
			processar();
		}

	}

	public static void exibeTodasNotas() {
		JOptionPane.showMessageDialog(null,
				"Notas de Cinquenta: " + notaCinquenta + "\n" + "Notas de Vinte: " + notaVinte + "\n" + "Notas de Dez: "
						+ notaDez + "\n" + "Notas de Cinco: " + notaCinco + "\n" + "Notas de Dois: " + notaDois);

	}
}