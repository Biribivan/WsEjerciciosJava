package ED_03_Condicionales1_;

import java.util.Scanner;

//Ejercicio de Evaluación de Notas: 
//Crea un programa que solicite al usuario una nota (un número entre 0 y 100) y muestre "Aprobado" si la nota es mayor o igual a 50
//o "Suspenso" si la nota es menor a 50.
public class Ej_03_EvaluaciónDeNotas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a tu programa Java para saber si eres apto según tu nota");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
	
		System.out.println("Introduce tu nota, tiene que ser un valor entre el 0 y el 100");
		int nota= sc.nextInt();
		String numero= "";
		if(nota<=49) {
			numero="Suspenso";
			System.out.println("El resultado de tu nota es: " +numero);
			
		}
		 else if(nota>=50 && nota<100) {
			numero ="Aprobado";
			System.out.println("El resultado de tu nota es: " +numero);
			
		}
		 else {
			 System.out.println("Numero fuera de rango");
		 }
		System.out.println("Fin del programa");
	}

}
