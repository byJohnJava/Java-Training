package exec9;

/**
 * Classe para alterar String para maiúscula e mminúscula
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

public class ConversorString {
	public static void main(String[] args) {

		String lista[] = new String[5];

		lista[0] = "Java";
		String str = lista[0];
		String maiuscula = str.toUpperCase();
		String minuscula = str.toLowerCase();
		
		System.out.println("Original: " + str);
		System.out.println("Maiúscula: " + maiuscula);
		System.out.println("Minúscula: " + minuscula);

	}
}
