package ED_04_SwitchYTenario;

import java.util.Scanner;

public class _03_ED_Ej5_Switch {

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
		
		switch (operar) {
		case 1:
			double suma= num1+num2;
			System.out.println("La suma de tus valores es "+suma);
			break;	
		case 2: 
			double resta=num1-num2;
			System.out.println("La resta de tus valores es "+resta);
			break;
		case 3: 
			double multi=num1*num2;
			System.out.println("El producto de tus valores es "+multi);
			break;
		case 4: 
			double div=num1/num2;
			System.out.println("El cociente de tus valores es "+div);
			break;
		case 5: 
			double resto=num1%num2;
			System.out.println("El resto de tus valores es "+resto);
			break;

		default:
			System.out.println("El número introducido no está en el menú de opciones");
			break;
		}
	}
}
