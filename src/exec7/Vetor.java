package exec7;

/**
 * Classe para testar vetores
 * @author jaraujo
 * @since 13/02/2020
 * @version 0.1
 */

public class Vetor {

	public static void main(String[] args) {
		
		// Criando vetor do tipo inteiro com nome quantidade
		int quantidade[];
		
		//instanciando o vetor quantidade com quatro posições
		quantidade = new int[4];
		
		// inicializando vetores na posições 0 e 3 com os valores 10 e 4
		quantidade[0] = 10;
		quantidade[3] = 4;
		
		
		System.out.println("Valor do vetor: " + quantidade);
		
		for (int i = 0; i < quantidade.length; i++ ) {
			System.out.println("Valor do vetor: " + quantidade[i]);
			
		}

	}

}
