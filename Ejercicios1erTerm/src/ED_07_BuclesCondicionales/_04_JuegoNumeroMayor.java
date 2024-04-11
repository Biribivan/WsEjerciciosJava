package ED_07_BuclesCondicionales;

import java.util.Scanner;

/*
 * Juego número mayor: 
 * Desarrolla un algoritmo que determine cual es el mayor de los números 
 * ingresados por teclado. El programa pedirá un número tendrá que valorar 
 * si es el mayor. El programa continuará pidiendo números hasta se ingrese 
 * un número negativo y acabará mostrando el número mayor.
 */
public class _04_JuegoNumeroMayor {

	public static void main(String[] args) {
		System.out.println("JUEGO DEL NUMERO MAYOR");
		System.out.println("-------------------------");
		

		Scanner sc= new Scanner(System.in);
		int numero = 0;
		int mayor =0;
		do {
			
			System.out.println("A continuación vas a introducir varios números positivos, cuando quieras finalizar introduce un número negativo");
			numero=sc.nextInt();
			if (numero>mayor) {
				mayor=numero;
			}
		}while (numero>=0);
		System.out.println("El número ingresado es " +mayor);
	}

}
