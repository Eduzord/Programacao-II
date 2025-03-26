package primeirospassos;

public class Operadores2 {

	public static void main(String[] args) {
		//Operadores de incremento e decremento
		//pré ou pós operação
		// i++ : avalia a expressão antes do valor ser acrescido.
		// i-- : avalia a expressão antes do valor ser decrescido.
		// ++i : o valor é acrescido e depois a expressão é avaliada.
		// --i : o valor é decrescido e depois a expressão é avaliada.
		
		int i = 10;
		int j = 5;
//		int k = j++ + i;
		int k = ++j + i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
