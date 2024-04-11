package ED_05_BucleFor;

import java.util.Scanner;

/*
 * Ejercicio 11:Calcular la potencia de un número introducido por pantalla (por ejemplo, 2^3).
 * No se puede utilizar la función Math.pow
 */
public class _11_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bienvenido a tu prograama Java para calcular potencias :) ");
		System.out.println("----------------------------------------------------------");
		System.out.println("Por favor introduce la base");
		int base=sc.nextInt();
		System.out.println("A continuación el exponente");
		int exponente=sc.nextInt();
		int resultado=1;
		for(int i=1; i<=exponente;i++) {
			resultado*=base;	
		}
		System.out.println(resultado);
	}
}
