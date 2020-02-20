package exec10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
		
		
		try {
			
			Scanner leitor = new Scanner(new FileReader("Entrada.txt"));
			while(leitor.hasNext()) {
				System.out.println(leitor.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo de entrada não encontrado");
			// e.printStackTrace();
		}
		
	}

	}


