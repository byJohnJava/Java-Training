package exec6;


import java.time.Year;

import org.joda.time.Days;


/**
 * Classe Aluno
 * 
 * @author jaraujo 
 * @since 12/02/2020 
 * @version 0.1
 */

public class Aluno {

	String nome;
	String dataNascimento;
	int anoNascimento;
	String curso;
	String cidade;

	public Aluno() {

	}

	public Aluno(String nome, String dataNascimento, int anoNascimento, String curso, String cidade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.anoNascimento = anoNascimento;
		this.curso = curso;
		this.cidade = cidade;
	}

	public int calcularIdadeData() {

		String data = (new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())));
		int dataConvertida = Integer.parseInt(data);

		String datas[] = dataNascimento.split("/");
		String dataNasc = datas[2] + datas[1] + datas[0];
		int anoNasc = Integer.parseInt(dataNasc);

		int resultado = dataConvertida - anoNasc;

		resultado = (resultado % 1000000 / 10000);

		return resultado;

	}

	public int diasVida() {
		
	
	}

	public int calculaIdade() {

		Year y = Year.now();
		int ano = y.getValue();
		return ano - anoNascimento;

	}

	public void exibirTudo() {
		System.out.println(nome);
		System.out.println(anoNascimento);
		System.out.println(curso);
		System.out.println(cidade);
		System.out.println(calculaIdade());
		System.out.println(calcularIdadeData());
		System.out.println(diasVida());
	}

}
