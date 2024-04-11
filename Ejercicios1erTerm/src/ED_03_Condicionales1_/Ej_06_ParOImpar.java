package ED_03_Condicionales1_;
//Ejercicio de Par o Impar: 
//Crea un programa que solicite un número al usuario y determine si es par o impar. 
//Debe imprimir "Es un número par" o "Es un número impar" según corresponda.
import java.util.Scanner;
public class Ej_06_ParOImpar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a tu programa Java para saber si un número es par o impar");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
		
		System.out.println("Por favor, introduce el número");
		int valor=sc.nextInt();
		System.out.println("El valor introducido es: " +valor);
		
		String esPar="";
		//Si al dividir el número introducido entre dos el resto es igual a 0, 
		//el numero es par, si no, el numero es impar
		if (valor%2==0) {
			System.out.println("El valor introducido es par");			
		}
		else {
			System.out.println("El valor introducido es impar");
		}
		System.out.println("FIN DEL PROGRAMA");
	}

}
