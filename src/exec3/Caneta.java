package exec3;

/**
 * Essa classe � respons�vel por armazenar as caracteristicas e m�todos de Produto, e seus pr�prios atributos e m�todos.
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
			System.out.println("A vari�vel n�o possui valor");
		}
		if (formato != null) {
			System.out.println(formato);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		if (marca != null) {
			System.out.println(marca);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		exibirTudo();
	}
}
