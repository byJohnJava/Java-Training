package exec6;

/** Classe responsável por testar a Classe Aluno 
 * @author jaraujo 
 * @since 13/02/2020
 * @version 0.1
 */

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("Joao", "20/04/1997", 1998, "Curso Java", "Osasco");
		a.exibirTudo();	
		
		DateTime dataInicial = new DateTime(1998, 1, 14, 0, 0);
		DateTime dataFinal = new DateTime(2020,2,12,0,0);
		
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		System.out.println(dias);
	}

}
	


