package primeirospassos;

public class Estruturas5 {
	// break NÃO rotulado

	public static void main(String[] args) {
		String nomes[] = {"Fabio", "Josué","Bárbara","Vinícius","Matheus"};
		
		String nomeBuscado = "Bárbara";
		boolean nomeEncontrado = false;
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(nomeBuscado)){
				nomeEncontrado = true;
				break;
			}
			}
		
		if (nomeEncontrado) {
			System.out.println("O nome "+ nomeBuscado +" foi encontrado  \\o/ \\o/ \\o/");
		} else {
			System.out.println("O nome "+ nomeBuscado + " NÃO foi encontrado :c");
		}
		
		
		}

	}


