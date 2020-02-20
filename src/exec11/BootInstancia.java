package exec11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BootInstancia {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("Entrada.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			
			String texto = leitor.readLine();
			
			while (texto != null) {
				String dados[] = texto.split(" ");
				String aux = dados[2].replace(";", "");
				
				System.out.println(aux + " = new " + dados[1] + "();");
				
				
				texto = leitor.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
