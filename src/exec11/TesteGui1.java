package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {
	
	//Declarar as variáveis de referência
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {
		
		//Criar uma nova janela(instância)
		janela = new JFrame("Minha primeira tela");
		//Criar um novo botão(instância)
		botao = new JButton("Clique aqui");
		//Adicionar o botão ao painel da janela
		janela.getContentPane().add(botao);
		//Configurar o tamanho da tela
		janela.setSize(300, 300);
		//Configurar a visibilidade da tela (true/false)
		janela.setVisible(true);
		//Informar que a tela não tem layout pré-definido
		janela.getContentPane().setLayout(null);
		
	}

}
