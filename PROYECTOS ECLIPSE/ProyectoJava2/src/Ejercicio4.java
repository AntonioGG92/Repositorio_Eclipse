import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		int semana;
		int horas; 

		System.out.println("Dia de la semana de inicio (1-7) :");

		byte semanaI = leer.nextByte();

		System.out.println("Hora del dia de inicio (0-23) :");

		byte horasI = leer.nextByte();

		System.out.println("Dia de la semana de fin (1-7) :");

		byte semanaF = leer.nextByte();

		System.out.println("Hora del dia de fin (0-23) :");

		byte hF = leer.nextByte();

		if(horasI<24 & semanaI<8 & hF<24 & semanaF<8) {
			semana = (semanaF - semanaI);
			horas = (semana*24);
			horas = horas + (horasI-hF);
			System.out.println("El rango horario es : " +horas+ "horas");
		}
		else {
			System.out.println("Estas horas estan fuera de rango");

			leer.close();
		}
	}

}
