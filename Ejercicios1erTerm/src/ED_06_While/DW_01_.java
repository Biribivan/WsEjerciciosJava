package ED_06_While;
import java.util.Scanner;
/*
 * Pedir un número al usuario e imprimir su tabla de multiplicar.
 */
public class DW_01_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para conocer su tabla de multiplicar: ");
        int num = sc.nextInt();       
        int contador = 1;

        System.out.println("Tabla de multiplicar de " + num + ":");
        do {
            System.out.println(num + " x " + contador + " = " + (num * contador));
            contador++;
        } while (contador <= 10);
}
}