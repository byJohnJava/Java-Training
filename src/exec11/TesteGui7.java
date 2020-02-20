package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TesteGui7 {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		// criar as instâncias
		janela = new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu1 = new JMenuItem("Item 1");
		itemMenu2 = new JMenuItem("Item 2");
		painelDaJanela = (JPanel) janela.getContentPane();

		// acrescentar menus na barra de menu
		barraMenu.add(menu01);
		barraMenu.add(menu02);

		// acrescentar items de menu nos menus
		menu01.add(itemMenu1);
		menu02.add(itemMenu2);

		// configurando ação do item de menu 1
		itemMenu1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new TesteGui4().iniciaGui();
			}
		});

		// configurando ação do item de menu 2
		itemMenu2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new TesteGui5().iniciaGui();
			}
		});

		// configurações do painel da tela
		painelDaJanela.setLayout(null);

		// configurações da tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);

	} // fim método iniciaGUi

	public static void main(String[] args) {
		new TesteGui7().iniciaGui();

	}

} // fim da Classe
