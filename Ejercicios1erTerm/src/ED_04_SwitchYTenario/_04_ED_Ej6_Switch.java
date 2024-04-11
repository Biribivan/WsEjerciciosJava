package ED_04_SwitchYTenario;

import java.util.Scanner;

public class _04_ED_Ej6_Switch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a tu programa Java para saber si un número es par o impar");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
		
		System.out.println("Por favor, introduce el número");
		int valor=sc.nextInt();
		System.out.println("El valor introducido es: " +valor);
		int klk= valor%2;
		
		switch (valor) {
		case 0:
			System.out.println("El numero es par");
			break;

		default:
			System.out.println("El numero es impar");
			break;
		}
	
			
		}

	}

