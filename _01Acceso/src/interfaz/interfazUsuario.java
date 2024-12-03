package interfaz;

import java.util.Scanner;

import modelo.entidad.Usuario;
import modelo.negocio.GestorUsuario;

public class interfazUsuario {
	private GestorUsuario gu = null;
	private Scanner scString = new Scanner(System.in);
	private Scanner sc = new Scanner(System.in);
	
	public void mostrarInterfaz () {
		System.out.println("Bienvenido a la app");
		Usuario usuario = null;
		gu = new GestorUsuario();
		int respuesta = 0;
		
		int contador= 0;
		boolean valido = false;
		
		while (contador <3 &&!valido) {
			usuario = pedirDatos();
			respuesta = gu.validar(usuario);
			switch (respuesta) {
			case 0:
				System.out.println("Usuario no existe");
				break;
			case 1:
				System.out.println("Usuario correcto, welcome");
				valido = true;
				iniciarApp(usuario);
				break;
			case 2:
				System.out.println("Usuario o contraseña invalidos");
				contador++;
				break;
			case 4:
				System.out.println("Error de acceso, intentalo mas tarde");
				break;
			}
			
		}
		System.out.println("Fin de la app");
	}

	private void iniciarApp(Usuario u) {
		System.out.println("Bienvenido al perfil de " +u.getNombre() );
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				darAltaUsuario();
				break;
			}
		} while (opcion != 1);
		
	}

	private void darAltaUsuario() {
		Usuario u = pedirDatos();
		int respuesta = gu.guardar(u);
		switch (respuesta) {
		case 1:
			System.out.println("Usuario en blanco o con espacios en blanco");
			break;
		case 2:
			System.out.println("Password en blanco o con espacios en blanco");
			break;
		case 3:
			System.out.println("Usuario guardado");
			break;
		case 4:
			System.out.println("Error de acceso");
			break;
		}
		
	}

	private int menu() {
		boolean correcto = false;
		int opcion = 0;
		while (!correcto) {
			System.out.println("Elije una opcion");
			System.out.println("1: Registar usuario");
			System.out.println("0: Registrar usuario");
			opcion = sc.nextInt();
			if (opcion >= 0 && opcion <=1) {
				correcto = true;
			}
			return opcion;
		}
		return opcion;
	}

	private Usuario pedirDatos() {
		System.out.println("Introduzca el nombre");
		String nombre = scString.nextLine();
		System.out.println("Introduzca la contraseña");
		String pass = scString.nextLine();
		
		Usuario u = new Usuario();
		u.setNombre(nombre);
		u.setPassword(pass);
		return u;
	}
}
