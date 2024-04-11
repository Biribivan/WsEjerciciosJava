package ED_04_SwitchYTenario;
//REALIZAR EL SIGUIENTRE EJERCICIO MEDIANTE OPERADOR TERNARIO
import java.util.Scanner;

public class _01_ED_Ej1_ternario {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un valor");
		int numero= sc.nextInt();
		
		System.out.println("Introduce el segundo valor");
		int num= sc.nextInt();
		
		String cadena = (numero<=num) ?  num +" es Menor que "+numero : num +" es Mayor que " +numero;
		System.out.println(cadena);
		
	}
}


