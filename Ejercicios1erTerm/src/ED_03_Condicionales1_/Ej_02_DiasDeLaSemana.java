package ED_03_Condicionales1_;

import java.util.Scanner;

/*
 * Ejercicio de Días de la Semana: Escribe un programa que pida al usuario 
 * que introduzca un número del 1 al 7 y muestre el día de la semana correspondiente. 
 * Por ejemplo, si el usuario ingresa 1, el programa debería imprimir "Lunes"
 */
public class Ej_02_DiasDeLaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a tu programa para saber que dia de la semansa es");
		System.out.println("-------------------------------------------------------------");
		System.out.println("BY: Ivan dos Santos");
		
		
		System.out.println("Introduce un número del 1 al 7");
		int numero= sc.nextInt();
		
		String dia="";
		if(numero==1) {
			dia="Lunes";
		}else if (numero==2) {
			dia="Martes";
		}else if (numero==3) {
			dia="Miércoles";
		}else if (numero==4)  {
			dia="Jueves";    
		}else if (numero==5) {
			dia="Viernes";
		}else if (numero==6) {
			dia="Sábado";
		}else if (numero==7){
			dia="Domingo";
		}else {
			System.out.println("Numero fuera de rango");
		return;
		}
		System.out.println("El dia de la semana correspondiente al número indicdo es: " +dia);
	}
}


