package ED_05_BucleFor;

import java.util.Scanner;

/*
 * Ejercicio 9:
 * Realizar las tareas 3, 5 y 8 mediante funciones.
 * La función debe de hacer la funcionalidad sin pedir los valores, los valores los deberá pedir la clase "main" 
 * y pasarlos como parámetros de entrada a las funciones
 */
public class _09_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ejercicio 3");
		System.out.println("------------");
		System.out.println("Introduce el primer valor:");
		int valor1=sc.nextInt();
		
		System.out.println("Introduce el segundo y último valor:");
		int valor2=sc.nextInt();
		ejercicio3(valor1,valor2);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Ejercicio 5");
		System.out.println("Hola buena Hulio :)");
		System.out.println("Introduce un valor para conocer su tabla de multiplicar");
		int num1=sc.nextInt();
		ejercicio5(num1);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Ejercicio 8");
		System.out.println("BIENVENIDO A TU PROGRAMA PARA CALCULAR FACTORIALES");
		System.out.println("Introduce un número");
		long factorial=sc.nextLong();
		long num=1;

		ejercicio8(num);
	
	}
	public static void ejercicio3 (int valor1, int valor2) {
		if(valor1<valor2) {
			for(int i = valor1; i<=valor2; i++) {
				System.out.println("El valor 1 hasta el valor 2 es: " +i);
			}
		}
		 else {
			for(int i = valor2; i<=valor1; i++) {
				System.out.println("El valor del numero 2 hasta el 1 es: " +i);
			}
		}
		
	}	
	public static void ejercicio5 (int num1) {
		for (int i = 1; i <= 10; i++) {
            int resultado = num1 * i;
            System.out.println(num1 + " * " + i + " = " + resultado);
        }	
	}
	public static void ejercicio8 (long num) {
		
		for(long factorial=1; factorial>=1; factorial--) {
			num=(long)(factorial*num);		
		System.out.println("El factorial de tu valor es = " +num);
		System.out.println("***********************************");
		System.out.println("FIN DEL PROGRAMA");
		
		}
	}
}
