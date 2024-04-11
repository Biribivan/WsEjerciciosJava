package ED_05_BucleFor;

import java.util.Scanner;

/*
 * eJERCICIO 3:Pedir 2 números por pantalla y que muestre los números desde el primer número hasta el segundo
 */
public class _03_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer valor:");
		int valor1=sc.nextInt();
		
		System.out.println("Introduce el segundo y último valor:");
		int valor2=sc.nextInt();
		
		if(valor2<valor1) {
			for(int i = valor1; i>=valor2; i--) {
				System.out.println("El valor 1 hasta el valor 2 es: " +i);
			}
		}
		 else {
			for(int i = valor1; i<=valor2; i++) {
				System.out.println("El valor del numero 2 hasta el 1 es: " +i);
			}
		}			
	}
}
