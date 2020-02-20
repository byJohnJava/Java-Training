package exec9;

/**
 * Classe para para testar modificadores de acesso
 * @author jaraujo
 * @since 17/02/2020
 * @version 0.1
 */

public class TesteData {

	public static void main(String[] args) {
		Data d1 =  new Data();
		
		// d1.dia = 10; The field isn't visible,
		
		d1.setDia(10);
		d1.getDia();

	}

}
