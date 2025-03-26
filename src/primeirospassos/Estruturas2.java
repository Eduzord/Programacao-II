package primeirospassos;

public class Estruturas2 {

	public static void main(String[] args) {
		int nota = 92;
		
		if (nota >= 90) {
			System.out.println("Excelente!");			
		} else if ((nota < 90) && (nota >= 80)) {
			System.out.println("Bom trabalho");			
		} else if ((nota < 80 )  && (nota >= 60)) {
			System.out.println("Passou!");			
		} else {
			System.out.println("You Lose!");
		}
	}

}
