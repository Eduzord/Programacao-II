package primeirospassos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO1 {

	public static void main(String[] args) throws IOException {
		BufferedReader dadoEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nome = "";
		
		System.out.println("Digite seu nome: ");
		
		nome = dadoEntrada.readLine();
		
		System.out.println("Olá seja bem vindo, "+ nome);
	}

}
