package primeirospassos;

public class Estruturas7 {
	
	//Continue NÃO rotulado
	public static void main(String[] args) {
		String nomes[] = {"Fabio", "Josué","Bárbara","Vinícius","Bárbara","Matheus", "Bárbara",};
		
		
		
		int count = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			if (!nomes[i].equals("Bárbara")) {
				continue;
			}
			count++;
		}
		System.out.println("Existem "+count+" alunas Bárbara na lista");
	}
}
