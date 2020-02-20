package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui5 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDajanela;

	public void iniciaGui() {

		// Criar as inst�ncias
		janela = new JFrame("Exemplo de Check Box");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDajanela = (JPanel) janela.getContentPane();

		// Configura��es da label Escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento: ");
		lblEscolha.setBounds(42, 15, 208, 18);

		// Configura��es da label Resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta: ");
		lblResposta.setBounds(42, 230, 300, 18);

		// Configura��es do check box Cart�o de Cr�dito
		cbCC.setText("Cart�o de Cr�dito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// Configura��es do check box Dep�sito Banc�rio
		cbDB.setText("Dep�sito Banc�rio");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// Configura��es do check box Boleto Banc�rio
		cbBB.setText("Cart�o de Cr�dito");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// Configura��es do bot�o
		btnResposta.setText("Resposta: ");
		btnResposta.setBounds(146, 196, 83, 28);

		btnResposta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
			}
		});

		// adicionar componentes no painel da tela
		painelDajanela.setLayout(null);
		painelDajanela.add(lblEscolha);
		painelDajanela.add(cbCC);
		painelDajanela.add(cbDB);
		painelDajanela.add(cbBB);
		painelDajanela.add(btnResposta);
		painelDajanela.add(lblResposta);

		// Configura��es da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

	} // fim do m�todo iniciaGui

	public void verificaSelecionado() {

		// verifica qual Radio Button foi selecionado
		String resposta = "";
		if (cbCC.isSelected()) {
			resposta += cbCC.getText();
		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();
		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();
		}

		// troca a cor da fonte para vermelho
		if (!resposta.equals("")) {
			lblResposta.setText(resposta);
		}

		resposta = "";
		
	} //fim do m�todo verificaSelecionado

	public static void main(String[] args) {
		new TesteGui5().iniciaGui();

	}

} // fim da classe
