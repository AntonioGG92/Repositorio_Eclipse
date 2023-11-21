import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int) (Math.random()*100);

		Scanner leer = new Scanner (System.in);


		int numero=0;

		int intentos=0;

		while(numero!=aleatorio) {

			intentos++;

			System.out.println("Introduce un número, por favor: ");

			numero = leer.nextInt();


			if(aleatorio<numero) {

				System.out.println("Más bajo.");
			}

			else if(aleatorio>numero) {

				System.out.println("Más alto.");

			}
		}
		System.out.println("CORRECTO. Lo has conseguido en: " + intentos + " Intentos");

	}

}
