import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);

		int i;
		int j;
		int altura;

		System.out.println("Introduce la altura: ");
		altura = leer.nextInt();

		for (i=1; i<=altura; i++) {
			for (j=1; j<=altura/2; j++) {
				if (((j==1 || j ==altura/2) && i !=altura) || (i==altura && j != 1 && j != altura/2)) {
					System.out.print("* ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("  ");
		}		
	}
}

