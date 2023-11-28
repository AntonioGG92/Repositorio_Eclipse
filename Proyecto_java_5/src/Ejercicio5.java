import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };
		char[] letra = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		int x = 0;
		int x1 = 0;

		do {
			System.out.println("Introduce la posición de la linea del alfil del 1 al 8");
			x = leer.nextInt()-1;

			if (x < 0 || x > 7) {
				System.out.println("Posición fuera de rango, vuelve a intentarlo");
			}
		} while (x < 0 || x > 7);

		do {
			System.out.println("Introduce la columna del alfil: Ejemplo (1 es A)(2 es B)(3 es C)....");
			x1 = leer.nextInt();

			if (x1 < 1 || x1 > 8) {
				System.out.println("Posición fuera de rango, vuelve a intentarlo");
			}
		} while (x1 < 1 || x1 > 8);

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 0 && i != 8) {
					System.out.print(" " + numeros[i] + " ");
				} else if (i == x && j == x1) {
					System.out.print(" A "); 
				} else if (Math.abs(i - x) == Math.abs(j - x1)) {
					System.out.print(" X "); 
				} else {
					System.out.print(" \u25A0 ");
				}
			}
			System.out.println();
		}
		System.out.print("   ");
		for (int i = 0; i < letra.length; i++) {
			System.out.print(" " + letra[i] + " ");

			leer.close();
		}
	}
}