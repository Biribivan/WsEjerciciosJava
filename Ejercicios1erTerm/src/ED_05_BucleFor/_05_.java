package ED_05_BucleFor;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Ejercicio 5:Pedir un número al usuario e imprimir su tabla de multiplicar.
 */
public class _05_ {
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);	
		System.out.println("Hola buena Hulio :)");
		System.out.println("Introduce un valor para conocer su tabla de multiplicar");
		int num1=sc.nextInt();
	
		for (int i = 1; i <= 10; i++) {
            int resultado = num1 * i;
            System.out.println(num1 + " * " + i + " = " + resultado);
        }	
	}
}
