package ED_06_While;

import java.util.Scanner;

/*
 * Calcular la potencia de un número introducido por pantalla (por ejemplo, 2^3). No se puede utilizar la función Math.pow. 
 */
public class DW_04_ {
	public static void main(String[] args) {
			System.out.println("CALCULAR POTENCIA");
			
			System.out.println("-----------------");
			Scanner sc=new Scanner(System.in);
			System.out.println("Por favor, introduce la base de tu potencia");
			int base=sc.nextInt();
			System.out.println("A continuación, introduce el exponente");
			int exponente=sc.nextInt();
			
			int potencia;
			do {
				potencia=base*exponente;
				System.out.println("La potencia de " +base +"^" +exponente +"=");
				
			} while ( potencia <=exponente);
				
	}
}

