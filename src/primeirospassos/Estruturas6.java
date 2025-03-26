package primeirospassos;

public class Estruturas6 {

	public static void main(String[] args) {
		int[][] numeros =  {{1,2,3}, {4,5,6}, {7,8,9}};

		int numeroBuscado = 5;
		boolean numeroEncontrado = false;

		rotuloBusca: for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if(numeroBuscado == numeros[i][j]) {
					numeroEncontrado = true;
					break rotuloBusca;
				}
			}
		}
		if (numeroEncontrado) {
			System.out.println("O número "+ numeroBuscado+" foi encontrado.");
		} else {
			System.out.println("O número "+ numeroBuscado+" NÃO foi encontrado.");
		}
	}


}

