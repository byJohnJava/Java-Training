package exec9;

/**
 * Classe para testar a lib Math e seus métodos
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

public class Matematica {

	public static void main(String[] args) {
		
		double x = 10, y = 20.3, z= -30;
		//Obtém Valor absoluto
		double abs = Math.abs(z);
		System.out.println(abs);
		//Retorna menor valor inteiro
		double ceil = Math.ceil(y);
		System.out.println(ceil);
		// Arredonda o valor para cima
		double floor = Math.floor(y);
		System.out.println(floor);
		// Calcula Logaritmo
		double log = Math.log(x);
		System.out.println(log);
		// Retorna o maior valor inteiro entre dois elementos
		double max = Math.max(x, y);
		System.out.println(max);
		// Retorna o menor valor inteiro entre dois elementos
		double min = Math.min(x, y);
		System.out.println(min);
		// Calcula potência
		double pow = Math.pow(x, 2);
		System.out.println(pow);
		// Calcula raiz quadrada
		double sqrt =  Math.sqrt(x);
		System.out.println(sqrt);
		// Calcula cosseno
		double cos = Math.cos(y);
		System.out.println(cos);
		// Calcula seno
		double sin = Math.sin(y);
		System.out.println(sin);
		// Calcula tangente
		double tan = Math.tan(y);
		System.out.println(tan);
	}

}
