import java.util.*;
public class Practica9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime la distancia en km de tu recorrido en bicicleta ");
			
		int distancia = leer.nextInt(); // guardamos en una variable llamada distancia los km a recorrer introducidos por el usuario */
		
		System.out.println("Dime la velocidad constante a la que irás ");
		
		int velocidad = leer.nextInt(); // guardamos en una variable llamada velocidad la velocidad constante introducida por el usuario */
			
		int tiempo = distancia/velocidad; // hacemos el calculo matematico para saber el tiempo */
		
		System.out.println("El tiempo que tardarás en llegar será de : " + tiempo + " HORAS ");
		
		leer.close();
	}

}
