package ED_06_While;

import java.util.Scanner;

public class DW_03_ {
	public static void main(String[] args) {
		System.out.println("Calcular el factorial de un número pedido por pantalla.");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introuduce un valor para saber su factorial");
		int num=sc.nextInt();
		
		do {
			int factorial= num--;
			System.out.println(num*factorial);
		} while (num>=1);	
	
		
	}
	
} 
