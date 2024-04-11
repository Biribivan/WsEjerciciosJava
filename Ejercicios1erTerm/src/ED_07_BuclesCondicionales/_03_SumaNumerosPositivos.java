package ED_07_BuclesCondicionales;

import java.util.Scanner;

/*
 * Suma de números positivos: Crea un algoritmo que solicite al usuario ingresar números positivos. 
 * El programa debe calcular la suma de esos números hasta que se ingrese un número negativo y acabará mostrando dicha suma.
 */
public class _03_SumaNumerosPositivos {
	public static void main(String[] args) {
		System.out.println("SUMA DE NUMEROS POSITIVOS");
		System.out.println("-------------------------");
		System.out.println("A continuación vas a introducir varios números positivos para sumarlos, cuando quieras finalizar introduce un número negativo");
		int suma=0;
		Scanner sc= new Scanner(System.in);
		int numero = 0;
		do {
			numero = sc.nextInt();
			if(numero >= 0) {
				suma+=numero;
			}			
		}while(numero >= 0);
	
		System.out.println("El resultado es: " + suma);
	}
	
}
