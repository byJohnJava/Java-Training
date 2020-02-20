package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {
	
	//Declarar os componentes de tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	
	public TesteGui3() {
		iniciaGui();
	}

	
	public void iniciaGui() {
		
		//Cria a janela (instância)
		janela = new JFrame();
		//Cria a area de texto
		area = new JTextArea();
		//Criar o primeiro botão
		botao1 = new JButton("Clique aqui");
		// Adicionar o método desenvolvido na classe TextoListener
		botao1.addActionListener(new TextoListener());
		//Criar o segundo botão
		botao2 = new JButton("Troca cor");
		botao2.addActionListener(new CorListener());
		//Cria um campo para digitar texto
		campo = new JTextField();
		campo.addActionListener(new TextoListener());
		//Adicionar o botão 1 ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		//Adicionar o botão 2 ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		//Adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER, area);
		//Adicionar JTextField ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		//Configurar o tamanho da janela
		janela.setSize(300, 300);
		//Configurar a visibilidade
		janela.setVisible(true);
		
	}
	
public class TextoListener implements ActionListener{
	
	
	public void actionPerformed(ActionEvent arg0) {
		area.append(campo.getText() + "\n");
		campo.setText("");
		
	}
}
public class CorListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		//Se o fundo for neutro troca para preto
		if(area.getBackground().equals(Color.BLACK)) {
			area.setBackground(Color.WHITE); //Troca fundo
			area.setForeground(Color.BLACK); //Troca letra
		} else {
			area.setBackground(Color.BLACK);
			area.setForeground(Color.WHITE);
		}
		
	}
	
}
	

	
	
	public static void main(String[] args) {
		new TesteGui3();

	}

}
