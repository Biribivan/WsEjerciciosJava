package ED_03_Condicionales1_;

import java.util.Scanner;

/*
 * Ejercicio de Calculadora Simple: 
 * Diseña una calculadora básica que permita a los usuarios realizar operaciones de 
 * suma, resta, multiplicación, división y resto de la división entera(%). El programa mostrará un menú de opciones con las operaciones a realizar. 
 * A continuación, el programa debe solicitar dos números y mostrar el resultado. Las operaciones de calculo tienen que estar hechas en funciones y
 *  la función devolverá el resultado de la operación. El menú que muestre el programa puede ser como el siguiente ejemplo:
Para sumar pulse 1
Para restar pulse 2
Para multiplicar pulse 3
Para dividir pulse 4
Para saber el resto de la división entera pulse 5

 */
public class Ej_05_CalculadoraSimple {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a tu programa Java para realizar las operaciones básicas de una calculadora con dos valores");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
		
		System.out.println("Por favor, introduzca el primer valor que desa operar.");
		int num1=sc.nextInt();
		System.out.println("A continuación el segundo valor");
		int num2=sc.nextInt();
		System.out.println("Gracias");
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		System.out.println("Tus opciones son las siguientes:");
		System.out.println(" * Para sumar pulse 1");
		System.out.println(" * Para restar pulse 2");
		System.out.println(" * Para multiplicar pulse 3");
		System.out.println(" * Para dividir pulse 4");
		System.out.println(" * Para saber el resto de la división entera pulse 5");
		int operar=sc.nextInt();
		
		String operacion="";
		if (operar==1) {
			double suma=num1+num2;
			System.out.println("La suma de tus valores es: " +suma);
		}
		else if (operar==2) {
			double resta=num1-num2;
			System.out.println("La resta de tus valores es:" +resta);
		}
		else if (operar==3) {
			double producto=num1*num2;
			System.out.println("El producto de tus valores es:" +producto);
		}
		else if (operar==4) {
			double divison=num1/num2;
			System.out.println("El cociente d etus valores es: " +divison);
		}
		else if(operar==5) {
			double resto=num1%num2;
			System.out.println("El resto de tus valores es: " +resto);
		}
		else {
			System.out.println("La opción escogida no existe");
		}
		System.out.println("FIN DEL PROGRAMA");
	}

}









