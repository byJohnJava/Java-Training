package exec3;

/**
 * Essa classe � respons�vel por armazenar as caracteristicas e m�todos de Produto, e seus pr�prios atributos e m�todos.
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneca extends Produto {
	
	public boolean estampa = true;
	public String material = "Pl�stico";
	public int medida = 4;
	
	public void exibirCaneca(){
		if (estampa == true) {
			System.out.println("Essa caneca possui estampa");
		} else {
			System.out.println("Essa caneca n�o possui estampa");
		}
		if (material != null) {
			System.out.println(material);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		if (medida > 0) {
			System.out.println(medida);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		exibirTudo();
	}
}
