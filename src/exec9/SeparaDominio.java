package exec9;

/**
 * Classe para validar e-mail e obter os caracteres antes e depois do arroba
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog(null, "Informe o e-mail: ", "Validador de e-mail", 1);
		// String email = JOptionPane.showInputDialog("Informe o e-mail: ");
		int cont = email.indexOf("@");
		if (cont > 0) {
			System.out.println("Posição do arroba: " + cont);
			String dominio = email.substring(cont+1);
			System.out.println("Domínio do e-mail: " + dominio);
			String usuario = email.substring(0,cont);
			System.out.println("Usuário do e-mail: " + usuario);
		}
		
		
		

	}

}
