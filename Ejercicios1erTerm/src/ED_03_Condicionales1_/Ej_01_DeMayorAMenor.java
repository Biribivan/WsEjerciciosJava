package ED_03_Condicionales1_;

import java.util.Scanner;

//Ejercicio de Mayor o Menor: 
//Escribe una función en Java que tome dos números como entrada e imprima "El primer número es mayor",
//"El segundo número es mayor" o "Los dos números son iguales" según cada caso. Luego, 
//la función main pedirá los dos números por pantalla e invocará a dicha función.
public class Ej_01_DeMayorAMenor {

	public static void main(String[] args) {
		System.out.println("Bienvenido a tu programa de Comparar números");
		System.out.println("--------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int numero1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int numero2=sc.nextInt();
		
		valores(numero1,numero2);
		
	}
	public static void valores(int num1, int num2){
		
		//Se puede hacer también con el Operador Ternario
		 boolean mayorN1=num1>num2?true : false;
		 
		 if (mayorN1) {
			 System.out.println("El primer número es mayor.");
		}
		 else {
			 System.out.println("El segundo número es mayor.");
		}
		 
		 
		//if (num1>num2) {
      //      System.out.println("El primer número es mayor.");
       // } else if (num2 > num1) {
          //  System.out.println("El segundo número es mayor.");
       // } else {
          //  System.out.println("Los dos números son iguales.");
       // }
	}

}
