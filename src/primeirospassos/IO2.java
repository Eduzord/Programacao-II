package primeirospassos;

import java.util.Scanner;

public class IO2 {

	public static void main(String[] args) {
		Scanner dadoEntrada = new Scanner(System.in);
		String nome = "";
		System.out.println("Digite seu nome: ");
		nome = dadoEntrada.next();
		
		System.out.println("Olá, seja bem vindo, "+	nome);
		dadoEntrada.close();
	}

}
