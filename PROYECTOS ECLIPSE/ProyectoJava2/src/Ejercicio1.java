import java.util.Scanner;

public class Ejercicio1 {

	private static final int CONTRASEÑA = 6666;

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int intento = 4;
		int clave;
		boolean caja = false;

		while (!caja && intento > 0) {
			System.out.print("Ingrese la contraseña: ");
			clave = leer.nextInt();

			if (clave == CONTRASEÑA) {
				caja = true;
			} else {
				intento--;
				System.out.println("Contraseña incorrecta. Intentos restantes: " + intento);
			}
		}

		if (caja) {
			System.out.println("Caja Abierta");
		} else {
			System.out.println("La caja está bloqueada");

			leer.close();
		}
	}
}
