package exec6;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TestaAluno {

	public static void main(String[] args) {
		/*
		Aluno a = new Aluno("Joao", "20/04/1997", 1998, "Curso Java", "Osasco");
		a.exibirTudo();	
		*/
		
		String dataCompleta = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		String data[] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		
		String dataCompletaAtual = new java.text.SimpleDateFormat("dd/MM/yyyy").format(new org.joda.time.DateTime(System.currentTimeMillis()));
		String dataAtual[] = dataCompletaAtual.split("/");
		int anoAtual = Integer.parseInt(dataAtual[2]);
		int mesAtual = Integer.parseInt(dataAtual[1]);
		int diaAtual = Integer.parseInt(dataAtual[0]);
		
		
		DateTime dataInicial = new DateTime(ano, mes, dia, 0, 0);
		DateTime dataFinal = new DateTime(anoAtual,mesAtual,diaAtual,0,0);
		
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		System.out.println(dias);
	}

}
	


