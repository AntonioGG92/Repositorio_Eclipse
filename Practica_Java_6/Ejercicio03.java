package practicas_de_ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {

		int[][] array = generarArrayAleatorio(6, 10, 0, 1000);

		
		System.out.println("Array generado:");
		imprimirArrayConResaltado(array);

		
		int[] posicionMaximo = encontrarPosicionExtremo(array, true);
		int[] posicionMinimo = encontrarPosicionExtremo(array, false);

		// Imprimir la posición del máximo y mínimo
		System.out.println("Posicion del max: Fila " + posicionMaximo[0] + ", Columna " + posicionMaximo[1]);
		System.out.println("Posicion del min: Fila " + posicionMinimo[0] + ", Columna " + posicionMinimo[1]);
	}

	// Función para generar un array aleatorio
	public static int[][] generarArrayAleatorio(int filas, int columnas, int min, int max) {
		int[][] array = new int[filas][columnas];
		for (int i = 0; i < filas; i++)
			for (int j = 0; j < columnas; j++)
				array[i][j] = (int) (Math.random() * (max - min + 1)) + min;
		return array;
	}

	// imprime el array estructurado con barra
	public static void imprimirArrayConResaltado(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 0) {
					System.out.print("| ");
				}
				if (j == array[i].length - 1) {
					System.out.printf("%4d |", array[i][j]);
				} else {
					System.out.printf("%4d ", array[i][j]);
				}
			}
			System.out.println();
		}
	}

	// Función para encontrar la posición del máximo o mínimo
	public static int[] encontrarPosicionExtremo(int[][] array, boolean esMaximo) {
		int extremo = array[0][0];
		int[] posicion = { 0, 0 };

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if ((esMaximo && array[i][j] > extremo) || (!esMaximo && array[i][j] < extremo)) {
					extremo = array[i][j];
					posicion[0] = i;
					posicion[1] = j;
				}

		return posicion;
	}
}