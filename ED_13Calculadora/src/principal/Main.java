package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidio a tu calculadora Java con librerias ");
		System.out.println("-------------------------------------------------");
		System.out.println("A continunación dime el primer numero que quieres operar");
		double n1 = sc.nextDouble();
		System.out.println("A continunación dime el segundo numeero que quieres operar");
		double n2 = sc.nextDouble();
		System.out.println("-------------------------------------------------");
		System.out.println("Opción 1: Sumar");		
		System.out.println("Opción 2: Restar");
		System.out.println("Opción 3: Multiplicar");
		System.out.println("Opción 4: Dividir");
		System.out.println("Opción 5: Salir del programa");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			
			break;
		case 2:
			System.out.println("El día es MARTES");
			break;
		case 3:
			System.out.println("El día es MIERCOLES");
			break;
		case 4:
			System.out.println("El día es JUEVES");
			break;
		case 5:
			System.out.println("El día es JUEVES");
			break;
		default:
			System.out.println("Tu opcion no esta en el menú, muñón");
			break;
		}

	}

}
