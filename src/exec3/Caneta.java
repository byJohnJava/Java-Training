package exec3;

/**
 * Essa classe é responsável por armazenar as caracteristicas e métodos de Produto, e seus próprios atributos e métodos.
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneta extends Produto {
	
	public String cor = "Preta";
	public String formato = "Redonda";
	public String marca = "BIC";
	
	public void exibirCaneta(){
		if (cor != null) {
			System.out.println(cor);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (formato != null) {
			System.out.println(formato);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (marca != null) {
			System.out.println(marca);
		} else {
			System.out.println("A variável não possui valor");
		}
		exibirTudo();
	}
}
