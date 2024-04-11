package ED_07_BuclesCondicionales;

import java.util.Scanner;

/*
 * Convertidor de temperatura: Diseña un algoritmo que convierta temperaturas entre Celsius y Fahrenheit
 * . El usuario debe elegir la dirección de la conversión y proporcionar la temperatura.
 */
public class _02_ConvertidorTemperatura {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("CONVERTIDOR DE TEMPERATURA");
		System.out.println("--------------------------");
		System.out.println("Elige el tipo de Conversión");
		System.out.println("--------------------------");
		System.out.println("1.De Celsius a Fahrenheit");
		System.out.println("2.De Fahrenheit a Celsius");
		int eleccion=sc.nextInt();
		
		if(eleccion==1) {
			System.out.println("Introduce los grados Celsius porfaplis, puede ser con decimal");
			double celsius=sc.nextDouble();
			double fahrenheit= (celsius * 9/5)+32;
			
			System.out.println("El resultado es: "+fahrenheit +"ºF");
		}
		else if (eleccion==2) {
			System.out.println("Introduce los grados Fahrenheit, puede ser en decimales :)");
			
			double fahrenheit=sc.nextDouble();
			double celsius= (fahrenheit * 9/5)-32;
			
			System.out.println("El resultado es: "+celsius +"ºC");
			
		} else {
			System.out.println("Debes elegir entre 1 o 2, reinicia el programa");
			

		}
		}
		
		
	}

