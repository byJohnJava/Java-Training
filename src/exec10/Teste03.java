package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {

	public static void main(String[] args) {

		try {
			File arquivo = new File("saida.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.println("Testando a forma correta");
			gravador.println("de para criar um arquivo");
			gravador.println("de texto");
			gravador.println("e gravar informações");
			gravador.close();
			arquivoOutput.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
