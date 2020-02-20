package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe para testar RadioButtons
 * @author jaraujo
 * @since 19/02/2020
 * @version 0.1
 */

public class TesteGui4 {

	// declarações de variáveis
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDesquitado;
	private JButton btnVerificar;
	private JPanel painelDajanela;
	private ButtonGroup grpRadio;

	public void iniciaGui() {

		// Criar as instâncias
		janela = new JFrame("Exemplo de Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDesquitado = new JRadioButton();
		btnVerificar = new JButton();
		painelDajanela = (JPanel) janela.getContentPane();

		// Cria o objeto de grupo de botões
		grpRadio = new ButtonGroup();

		// Adiciona os botões ao grupo
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDesquitado);

		// configurações da label Escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil: ");
		lblEscolha.setBounds(82, 18, 230, 18);

		// configuração do botão solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

		// configuração do botão casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

		// configuração do botão viuvo
		rbtViuvo.setText("Viúvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

		// configuração do botão desquitado
		rbtDesquitado.setText("Desquitado");
		rbtDesquitado.setBounds(80, 125, 150, 24);
		
		//configurações do botao
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 83, 28);
		
		//adicionar ação do botão
		btnVerificar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
			}
		});
		
		
		
		
		//configurações do painel da tela
		painelDajanela.setLayout(null);
		painelDajanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDajanela.add(lblEscolha);
		painelDajanela.add(rbtSolteiro);
		painelDajanela.add(rbtCasado);
		painelDajanela.add(rbtViuvo);
		painelDajanela.add(rbtDesquitado);
		painelDajanela.add(btnVerificar);
		
		//configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);
		
		
		
		
		

	} // fim do método iniciaGui
	
	public void verificaSelecionado() {
		
		// verifica qual Radio Button foi selecionado
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDesquitado.isSelected()) {
			resposta += rbtDesquitado.getText();
		}
		//troca a cor da fonte para vermelho
		if (!resposta.equals("")) {
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);
		}
		
		resposta = "";
	}

	public static void main(String[] args) {
		new TesteGui4().iniciaGui();
		

	}

}
