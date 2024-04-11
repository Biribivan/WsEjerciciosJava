package ED_06_While;
/*
 * Imprimir los números del 10 al 1 en orden descendente.
 */
public class DW_02_ {

	public static void main(String[] args) {
		int numero = 10;


        System.out.println("Números del 10 al 1 en orden descendente:");
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1);
	}
}
