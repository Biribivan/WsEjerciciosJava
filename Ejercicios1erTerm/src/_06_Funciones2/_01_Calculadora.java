package _06_Funciones2;

import java.util.Scanner;

/*
 * Crea una clase llamada "Calculadora" que contenga varios métodos para realizar
 *  operaciones matemáticas básicas como suma, resta, multiplicación y división. 
 *  Los métodos deben de estar sobrecargados para realizar las operaciones tanto
 *  en punto flotante como con números enteros. Una vez creadas las funciones se 
 *  invocarán desde el método 'main'.
 */

/*
 * Crea una función que pida 2 números enteros por pantalla y luego llame a las 4 
 * funciones del ejercicio 1. Esta función será invocada desde el método 'main'
 */
public class _01_Calculadora {
	
	public static void main(String[] args) {
		operacion(5.2, 7.4);
		operacion(81,9);
		int valor1=0;
		int valor2=0;
		ejercicio3(valor1,valor2);
	}
	
	public static double operacion(double a,double b) {
		double suma=a+b;
		double resta=a-b;
		double multiplicacion=a*b;
		double division=a/b;
		System.out.println("-------double--------");
		System.out.println("Suma:" +suma);
		System.out.println("---------------------");
		
		System.out.println("-------double--------");
		System.out.println("Resta:" +resta);
		System.out.println("---------------------");
		
		System.out.println("-------double--------");
		System.out.println("Multiplicación:" +multiplicacion);
		System.out.println("---------------------");
		
		System.out.println("-------double--------");
		System.out.println("División:" +division);
		System.out.println("---------------------");
		return 0;
}
	public static int operacion(int a,int b) {
		int suma=a+b;
		int resta=a-b;
		int multiplicacion=a*b;
		int division=a/b;
		System.out.println("----------int---------");
		System.out.println("Suma:" +suma);
		System.out.println("----------------------");
		
		System.out.println("----------int---------");
		System.out.println("Resta:" +resta);
		System.out.println("----------------------");
		
		System.out.println("----------int---------");
		System.out.println("Multiplicación:" +multiplicacion);
		System.out.println("----------------------");
		
		System.out.println("----------int---------");
		System.out.println("División:" +division);
		System.out.println("----------------------");
		return 0;
	}
	
	//EJERCICIO 3 Crea una función que pida 2 números enteros por pantalla y luego llame a las 4 
	//funciones del ejercicio 1. Esta función será invocada desde el método 'main'
	
	public static int ejercicio3(int a,int b) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame´un valor");
		int valor1= sc.nextInt();
		System.out.println("Dame otro valor");
		int valor2=sc.nextInt();
		
		operacion(valor1,valor2);
		
		
		
		return 0;
	}
	
}

