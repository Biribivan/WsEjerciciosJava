package ED_03_Condicionales1_;

import java.util.Scanner;

/*
 * Ejercicio de Descuento de Compra: Un supermercado desea implementar un sistema de descuentos para premiar a sus clientes. El descuento se basa en el monto total de la compra:

Si el importe total de la compra es igual o superior a $100, el cliente recibe un descuento del 10%.
Si el importe total de la compra es igual o superior a $50 pero menos de $100, el cliente recibe un descuento del 5%.
Si el importe total de la compra es inferior a $50, no hay descuento.
Escribe un programa en Java que solicite al usuario el importe total de la compra y determine el descuento que debe aplicarse y el importe final a pagar. 
El programa debe imprimir el descuento y el importe final. Ejemplo:

Ingrese el monto total de la compra: 120
El descuento aplicado (en %) es: 10
Importe total final a pagar: $108.0
 */
public class Ej_07_DescuentoCompra {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a tu programa para saber el Descuento que te corresponde según el valor de tu compra");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("BY: Iván Dos Santos");
		
		System.out.println("A continuación introduzca el valor de su compra:");
		double valor=sc.nextDouble();
		
		String compra="";
		if (valor<=50) {
			System.out.println("El valor de tu compra no es suficiente para aplicar un descuento, el total a pagar es: " +valor);
		}
		else if (valor>=51 && valor<=100) {
			double dto=valor*0.05;
			System.out.println("Se te aplica un descuento del 5% lo que equivale a un: " +dto);	
			double valorFinal=valor-dto;
			System.out.println("Importe total a pagar: " +valorFinal);	
		}
		else {
			double dto=valor*0.1;
			System.out.println("Se te aplica un descuento del 10% lo que equivale a un: " +dto);
			double valorFinal=valor-dto;
			System.out.println("Importe total a pagar: " +valorFinal);
		}
		System.out.println("fin del programa");
	}

}
