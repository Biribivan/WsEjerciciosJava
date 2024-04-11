package ED_07_BuclesCondicionales;

import java.util.Scanner;

/*
 * Verificador de números primos: Desarrolla un algoritmo que determine 
 * si un número ingresado por el usuario es primo o no. 
 * Un número es primo SOLAMENTE cuando es divisible por sí mismo y por 1.
 */
public class _06_VerificadorNumerosPrimos {

	public static void main(String[] args) {
		System.out.println("Número Primo");
		System.out.println("-------------------------");
		System.out.println("Introduce un número y t dire si es primo o surmano");
		
		Scanner sc= new Scanner(System.in);
		int numero=sc.nextInt();
		
		for(int i= 2;i < numero;i++) {
			if(numero%i==0) {
				System.out.println("klk");
			}
		}
	}

}
