package exec9;

/**
 * Classe para excluir espaços em branco de uma String
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

public class Trim {

	public static void main(String[] args) {
		
		String um = "Olá ";
		String dois = "Mundo ";
		System.out.println("Antes do trim: " + um + dois + ".");
		
		um = um.trim();
		dois = dois.trim();
		
		System.out.println("Depois do trim: " + um + dois + ".");

	}

}
