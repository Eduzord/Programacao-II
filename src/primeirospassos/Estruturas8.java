package primeirospassos;

public class Estruturas8 {

	public static void main(String[] args) {
		foraDoLooping : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Dentro do looping.");
				if(j == 2) {
					continue foraDoLooping;
				}
			}
			System.out.println("Dentro do looping for(i)");
		}
	}

}
