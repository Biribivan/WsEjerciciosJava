package ED_04_SwitchYTenario;

import java.util.Scanner;

public class _02_ED_Ej3_ternario {
	//Ejercicio de Evaluación de Notas: 
	//Crea un programa que solicite al usuario una nota (un número entre 0 y 100) y muestre "Aprobado" si la nota es mayor o igual a 50
	//o "Suspenso" si la nota es menor a 50.
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un valor entre el 1 y el 100");
		int numero= sc.nextInt();
		
		String cadena= (numero<=49) ? "Estas Supenso gañan" : "Aprovaste maquinon";
		System.out.println(cadena);

	}

}
