package exec5;

import javax.swing.JOptionPane;

/**
 * Classe para aluguel de filmes
 * 
 * @author jaraujo
 * @since 12/02/2020
 * @version 0.1
 */

public class AlugaFilme {

	double valorAluguelDiario = 10;
	double valorPago;
	int quantidadeDiasAlugados;
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = true;

	public void escolhaFilme() {

		int verificaFilme = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do filme a ser alugado: "));
		if (verificaDisponibilidade(verificaFilme)) {
			System.out.println("O filme está disponível");
			calculaValores();
		} else
			System.out.println("O filme não existe no catálogo");
	}

	public int quantidadeDiasAlugados() {
		return quantidadeDiasAlugados = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias: "));
	}

	public boolean verificaDisponibilidade(int escolha) {
		if (escolha == 1) {
			if (filmeInceptionDisponivel) {
				return true;
			} 
		}
			
			if (escolha == 2) {
				if (filmeStolenDisponivel) {
					return true;
		}
			
	}
			return false;
}
		


	public void calculaValores() {

		quantidadeDiasAlugados();
		double total = quantidadeDiasAlugados * valorAluguelDiario;
		JOptionPane.showMessageDialog(null, "O valor total é: " + total);
		valorPago = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor pago: "));
		if (valorPago < total) {
			JOptionPane.showMessageDialog(null, "Valor pago insuficiente");
		} else if (valorPago > total) {
			double troco = valorPago - total;
			JOptionPane.showMessageDialog(null, "Seu troco é: " + troco);
			JOptionPane.showMessageDialog(null, "Filme alugado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Filme alugado com sucesso");
		}
	}

	public static void main(String[] args) {
		AlugaFilme pessoa1 = new AlugaFilme();
		pessoa1.escolhaFilme();

	}

}
