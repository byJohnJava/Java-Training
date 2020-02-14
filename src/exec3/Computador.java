package exec3;

/**
 * Essa classe é responsável por armazenar as caracteristicas e métodos de Produto
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Computador extends Produto{
	
	public String processador = "i9";
	public String memoria = "32gb";
	public String tela = "21'";
	public String hd = "1TB";
	public String placaDeVideo = "RTX 2080";
	
	public void exibirComputador(){
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(hd);
		System.out.println(placaDeVideo);
		exibirTudo();
	}
	
}
