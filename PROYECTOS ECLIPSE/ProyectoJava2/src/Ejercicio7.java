import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		System.out.println("Escribe numeros alternativos :");

		long num = leer.nextLong();

		System.out.println("Escribe numeros alternativos:");

		long num2 = leer.nextLong();

		long a;

		String par="";

		String impar="";

		while(num>0 || num2>0) {
			a=num%10;
			if(a%2==0 & a!=0){
				par = par + a;
			}
			else if(a%2!=0) {
				impar = impar + a;
			}
			a=num2%10;
			if(a%2==0 & a!=0) {
				par = par + a;

			}else if(a%2!=0) {
				impar = impar + a;	

			}
			num2 = num2/10;
			num = num/10;
		}
		System.out.println("Los numeros pares son : " + par);
		System.out.println("Los numeros impares son : " +impar);
		leer.close();
	}

}
