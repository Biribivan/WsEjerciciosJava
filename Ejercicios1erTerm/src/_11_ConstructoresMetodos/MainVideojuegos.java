
package _11_ConstructoresMetodos;

import java.util.Scanner;

public class MainVideojuegos {
	public static void main(String[] args) {
		
		System.out.println("Hola buenas :)");
		System.out.println("Bienvenido a tu programa Java sobre Videojuegos");
		System.out.println("------------------------------");
		
		
		Videojuego v = new Videojuego();
		v.mostrarDatos();
		
		pedirDatosPrimerConstructor();
		
	}

	public static void pedirDatosPrimerConstructor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuación vas a introducir los siguientes datos que te pida sobre el Videojuego por favor :)");
		System.out.println("Además, pulsa enter para pasar al siguiente");
		System.out.println("Introduce el nombre del Videojuego");
		String nombreUsuario= sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce el ID");
		String idUsuario=sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce la puntuación");
		int puntuacionUsuario = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce el precio");
		double precioUsuario=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("¿Es de segunda mano?, solo serán correctas las respuestas 'true' y 'false' ");
		boolean esDeSegundaManoUsuario =sc.nextBoolean();
		sc.nextLine();
	}
}