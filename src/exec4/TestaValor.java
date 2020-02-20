package exec4;

/**
 * Classe para testar tipos de dados
 * @author jaraujo
 * @since 13/02/2020
 * @version 0.1
 */

public class TestaValor {
	public static void main(String[] args) {
		// byte b = (byte) 128;
		// System.out.println("O valor de b: " + b);
		String d = "100";
		int i = Integer.parseInt(d);
		String s = i + "";
		System.out.println(s);
	}
}
