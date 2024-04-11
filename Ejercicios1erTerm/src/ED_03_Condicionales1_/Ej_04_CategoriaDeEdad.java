package ED_03_Condicionales1_;

import java.util.Scanner;

//Ejercicio de Categoría de Edad: 
//Escribe un programa que pida la edad de una persona y determine 
//en qué categoría de edad se encuentra. Las categorías son: "Niño" (0-12 años), "Adolescente" (13-19 años),
//"Adulto" (20-64 años) y "Adulto Mayor" (65 años en adelante). El programa debe imprimir la categoría correspondiente.
public class Ej_04_CategoriaDeEdad {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a tu programa Java para saber en que categoria estas según tu edad");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
		
		System.out.println("Introduce tu edad");		
		int numero=sc.nextInt();
		
		String edad= "";
		if(numero<0){
			System.out.println("Todavia no ha nacido");
		}
		else if (numero<=12) {
			edad="Niño";
		}
		else if (numero>=13 && numero<=19) {
			edad="Adolescente";
		}
		else if (numero>=20 && numero<=64) {
			edad="Adulto";
		}
		else edad="Adulto Mayor";{			
		}
		
		System.out.println("Tu categoria según tu edad es: " +edad);
	}	
}