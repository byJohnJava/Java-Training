package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui6 {
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String[] equipamentos = {"Monitor", "Teclado", "Mouse", "Scanner", "Tela"};
	
	public void iniciaGui() {
		
		//Criar as instâncias
		janela = new JFrame("Exemplo de Combo Box");
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);
		
		//Configurações do Combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		//Configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);
		
		//Configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
	}

	public static void main(String[] args) {
		new TesteGui6().iniciaGui();

	}

}
