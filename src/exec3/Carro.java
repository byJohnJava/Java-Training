package exec3;

/**
 * Essa classe � respons�vel por armazenar as caracteristicas e m�todos de Produto, e seus pr�prios atributos e m�todos.
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Carro extends Produto{
	
	public String marca = "Toyota";
	public String modelo = "Corolla";
	public int ano = 2018 ;
	public String cor = "Prata";
	public String motor = "Autom�tico";
	
	public void exibirCarro(){
		if (marca != null) {
			System.out.println(marca);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		if (modelo != null) {
			System.out.println(modelo);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		if (ano > 1900) {
			System.out.println(ano);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		if (cor != null) {
			System.out.println(cor);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		if (motor != null) {
			System.out.println(motor);
		} else {
			System.out.println("A vari�vel n�o possui valor");
		}
		exibirTudo();
		
		
	}
}
