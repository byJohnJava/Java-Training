package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {
		
		//Definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Minha segunda tela em Java");
		janela.setSize(300,200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		
		//Definir o componente JButton(botao)
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(10, 10, 100, 20);
		
		//Definir o componente JLabel de rótulo
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome: ");
		lblNome.setBounds(10, 40, 40, 20);
		
		//Definir o campo de texto (JTextField)
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 100, 20);
		
		//Adicionar os componentes a tela
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
		//Informar a visibilidade da tela
		janela.setVisible(true);
		

	}

}
