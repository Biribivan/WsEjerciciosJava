package ED_06_While;

import java.util.Scanner;

/*
 * Pedir 2 números por pantalla y que muestre los números desde el primer número hasta el segundo
 */
public class W_03_ {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bienvenido a tu programa Java");
		System.out.println("A continuación, introduce un número entero");
		int num1=sc.nextInt();
		System.out.println("Ahora el segundo valor");
		int num2=sc.nextInt();
		System.out.println("Gracias, ahora te mostraré los números desde el primero hasta el segundo");
		
		while(num1<=num2) {
			System.err.println(num1++);
		}
	}

}
