package primeirospassos;

public class Estruturas1 {
	
	public static void main(String[] args) {
		int[] lista = {7,2,6};
		for (int i = 1;i < lista.length; i++) {
			int j = i - 1;
			int chave = lista[i];
			
			while(j>=0 && lista[j]> chave) {
				lista[j+1] = lista[j];
				j--;				
			}
			lista[j+1] = chave;			
		}
		String resultado = "";
		for(int i=0; i<lista.length;i++) {
			resultado += lista[i];	
		}
		System.out.println(resultado);
		
		int nota = 50;
		
		if(nota > 60) {
			System.out.println("Parabéns, você passou");
		} else {
			System.out.println("Você falhou miseravelmente");
		}
	}
	
}
