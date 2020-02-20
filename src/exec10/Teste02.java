package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	public static void main(String[] args) {
		
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Escrevendo");
			gravador.println("Informações");
			gravador.println("em um arquivo txt");
			gravador.println("na linguagem");
			gravador.println("Java");
			gravador.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
	}
}
