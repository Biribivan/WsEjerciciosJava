package ED_06_While;
/*
 * Imprimir números del 1 al 10.
 */
public class W_01_ {
	public static void main(String[] args) {
		int numero = 1;  //Primero iniciamos la variable y le damos el valor donde queremos q empieze
		while(numero <=10) { //Y le decimos que hasta que si la variable es menor o igual que 10
			System.out.println(numero++);	//Imprima la variable e incremente uno
			//Se repite el bucle hasta que se cumpla la Condición
		}
	}
}
