package exec3;

/**
 * Essa classe é responsável por armazenar as caracteristicas e métodos de Produto, e seus próprios atributos e métodos.
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Caneca extends Produto {
	
	public boolean estampa = true;
	public String material = "Plástico";
	public int medida = 4;
	
	public void exibirCaneca(){
		if (estampa == true) {
			System.out.println("Essa caneca possui estampa");
		} else {
			System.out.println("Essa caneca não possui estampa");
		}
		if (material != null) {
			System.out.println(material);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (medida > 0) {
			System.out.println(medida);
		} else {
			System.out.println("A variável não possui valor");
		}
		exibirTudo();
	}
}
