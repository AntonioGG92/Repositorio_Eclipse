import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe un numero :");
		int num = leer.nextInt();
		int a;
		String alreves ="";
		while (num>0) {
			a = num%10;
			alreves = alreves + a;
			num = num/10;
		}
		System.out.println(alreves);

		leer.close();
	}

}
