package exec9;

/**
 * Classe para contar quantidade de caracteres de uma String
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

public class ContaLetras {
	public static void main(String[] args) {
		
		String lista[] = new String[5];
		
		lista[0] = "Java";
		int cont = lista[0].length();
		System.out.println("A lista " + lista[0]);
		System.out.println("possui " + cont + " caracteres");
	}

}
