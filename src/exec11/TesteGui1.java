package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {
	
	//Declarar as vari�veis de refer�ncia
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {
		
		//Criar uma nova janela(inst�ncia)
		janela = new JFrame("Minha primeira tela");
		//Criar um novo bot�o(inst�ncia)
		botao = new JButton("Clique aqui");
		//Adicionar o bot�o ao painel da janela
		janela.getContentPane().add(botao);
		//Configurar o tamanho da tela
		janela.setSize(300, 300);
		//Configurar a visibilidade da tela (true/false)
		janela.setVisible(true);
		//Informar que a tela n�o tem layout pr�-definido
		janela.getContentPane().setLayout(null);
		
	}

}
