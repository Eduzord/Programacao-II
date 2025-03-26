package primeirospassos;

public class Operadores {

	public static void main(String[] args) {
		//Operadores de incremento e decremento
		//pré ou pós operação
		// i++ : avalia a expressão antes do valor ser acrescido.
		// i-- : avalia a expressão antes do valor ser decrescido.
		// ++i : o valor é acrescido e depois a expressão é avaliada.
		// --i : o valor é decrescido e depois a expressão é avaliada.
		
		int i = 5;
		System.out.println(i);
		
//		int j = i++;
		int j = ++i;
		System.out.println(i);
		System.out.println(j);
	}

}
