import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);

		int[] numero = new int[20];

		for (int i=0;i<9;i++) {
			System.out.println("Introduce algún número");
			numero[i]= leer.nextInt();
		}
		leer.close();

		for(int i=10;i>0;i--) {
			System.out.print(numero[i] + " ");

		}
	}
}