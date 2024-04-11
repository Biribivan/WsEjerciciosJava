package _05_Funciones;
//Ejercicio 001: Crea una función que imprima por pantalla un menú como el que sigue:
//1.Entrar en la aplicación.
//2.Registrarse en la aplicación
//3.Salir del programa

//Una vez creada la función, llamar a la función 3 veces desde el método 'main'
public class _01_ {
	
	public static void main(String [] args) {
		eligeMenu();
		eligeMenu();
		eligeMenu();
	}

	public static void eligeMenu() {
		System.out.println("Este es tu menú de opciones");
		System.out.println("---------------------------");
		System.out.println("1.Entrar en la aplicación.");
		System.out.println("2.Registrarse en la aplicación");
		System.out.println("3.Salir del programa");
	}
	
	public static void eligeMenu2(){
		//OTRO MÉTODO
		//Utilizando '\n'. cUANDO IMPRIMAMOS POR CONSOLA ESTO HACE UN SALTO DE LÍNEA
		System.out.println("Este es tu menú de opciones\n");
		System.out.println("---------------------------\n");
		System.out.println("\t1.Entrar en la aplicación.\n");
		System.out.println("\t2.Registrarse en la aplicación\n");
		System.out.println("\t3.Salir del programa\n"); //Con \t tabula
	}
}
	
