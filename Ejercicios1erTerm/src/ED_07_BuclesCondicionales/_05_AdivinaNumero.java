package ED_07_BuclesCondicionales;

import java.util.Random;
import java.util.Scanner;

/*
 * Juego adivina el número: Crea un juego donde el programa genera un número 
 * aleatorio y el usuario tiene que adivinarlo. El programa debe dar pistas como 
 * "muy alto" o "muy bajo" hasta que el usuario adivine. 
 * Para generar números aleatorios podemos usar las siguientes sentencias:
 */
public class _05_AdivinaNumero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int numAleatorio=r.nextInt(10) + 1;
		
		System.out.println("ADIVINA EL NUMERO");
		System.out.println("-------------------------");
		System.out.println("sE VA A GENRAR UN NÚMERO ALEATORIO Y TIENES Q ADIVINARLO");
		System.out.println("Introduce un número");
		
		int numero=sc.nextInt();
		
		do {
			if(numero<numAleatorio) {
				System.out.println("T has qdao corto");
				numero=sc.nextInt();		
			}else if(numero>numAleatorio) {
				System.out.println("Tas pasao");
				numero=sc.nextInt();
			}else {
				System.out.println("Ganaste, el numero dado era: "+numAleatorio);
			}
		} while (numero!=numAleatorio);{
			
		}	
	}
}
