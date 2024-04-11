
package ED_07_BuclesCondicionales;

import java.util.Scanner;

/*
 * Contador de números pares: Escribe un algoritmo que cuente y muestre la cantidad de números pares en un rango dado por el usuario.
 */
public class _01_ContadorNumerosPares {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contador=0;
		System.out.println("CONTADOR DE NÚMEROS PARES");
		System.out.println("--------------------------");
		System.out.println("A continuación introduce el primer valor ");
		int inicio= sc.nextInt();
		System.out.println("Ahora el segundo número, recuerda que el primer valor debe ser menor al segundo");
		int ultimo=sc.nextInt();
		
		if (inicio<ultimo) {
			for(int i=inicio;i<=ultimo;i++) {
				if (i%2==0) {
					contador++;
				}
			}
			System.out.println("La cantidad de números pares en tu rango es de "+contador);
		}
		else {
			System.out.println("Garrulo el primer numero debe ser menor que el segundo");
		}
	}
}
