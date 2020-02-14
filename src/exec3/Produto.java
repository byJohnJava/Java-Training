package exec3;

/**
 * Classe Produto com seus atibutos e m�todos
 * @author jaraujo
 * @since 11/02/2020
 * @version 0.1
 */

public class Produto {
	
	public String nome;
	public int quantidade;
	public double custo;
	public double quantidadeVendida;
	public double percentualDeLucro;
	
	public void exibirNome(){
		if (nome != null) {
			System.out.println(nome);
		} else {
			System.out.println("A vari�vel nome n�o tem valor");
		}
		
	}
	public void exibirValor(){
		if (custo > 0 && percentualDeLucro > 0) {
			System.out.println(custo + (custo * percentualDeLucro));
		} else {
			System.out.println("As vari�veis n�o possuem valor");
		}
		
	}
	public void exibirLucro(){
		
		if (custo > 0 && percentualDeLucro > 0) {
			System.out.println(custo * percentualDeLucro);
		} else {
			System.out.println("As vari�veis n�o possuem valor");
		}
		
	}
	public void exibirTudo(){
		exibirNome();
		exibirValor();
		exibirLucro();
	}
}
