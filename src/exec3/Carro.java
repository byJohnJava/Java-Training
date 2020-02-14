package exec3;

/**
 * Essa classe é responsável por armazenar as caracteristicas e métodos de Produto, e seus próprios atributos e métodos.
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Carro extends Produto{
	
	public String marca = "Toyota";
	public String modelo = "Corolla";
	public int ano = 2018 ;
	public String cor = "Prata";
	public String motor = "Automático";
	
	public void exibirCarro(){
		if (marca != null) {
			System.out.println(marca);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (modelo != null) {
			System.out.println(modelo);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (ano > 1900) {
			System.out.println(ano);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (cor != null) {
			System.out.println(cor);
		} else {
			System.out.println("A variável não possui valor");
		}
		if (motor != null) {
			System.out.println(motor);
		} else {
			System.out.println("A variável não possui valor");
		}
		exibirTudo();
		
		
	}
}
