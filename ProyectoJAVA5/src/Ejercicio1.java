import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int filas=4;
		int columnas=5;
		int suma=0;
		int [][] numeros= new int [filas][columnas];
		
		for (int i=0;i<filas; i++) {
			for(int j=0;j<columnas;j++) {

				System.out.println("Introduce la coordenada "+ (i+1) +","+ (j+1));
				numeros[i][j]=leer.nextInt();
			}
		}
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.printf("%d\t\t", numeros [i][j]);
				suma+=numeros[i][j];
			}
			System.out.print("Fila "+ (i+1) + ": " + suma);
			suma=0;
			System.out.println();
		}
		for (int j = 0; j < columnas; j++) {
			for (int i = 0; i < filas; i++) {
				suma+= numeros[i][j];
			}
			System.out.print("Col " + (j+1) + ":" + suma + "         ");

			suma=0;
			
			leer.close();
		}
	}

}

