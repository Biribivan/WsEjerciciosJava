package ED_05_BucleFor;

import java.util.Scanner;

//Calcular el factorial de un número pedido por pantalla. El factorial de un número es 
//el número multiplicado por sus anteriores hasta el 1. EJ: 5!= 5*4*3*2*1

public class _08_ {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("BIENVENIDO A TU PROGRAMA PARA CALCULAR FACTORIALES");
			System.out.println("Introduce un número");
			System.out.println("--------------------");
			long num=1;
			for(long factorial=sc.nextLong(); factorial>=1; factorial--) {
				num*=factorial;		
		}
			System.out.println("El factorial de tu valor es = " +num);
			System.out.println("***********************************");
			System.out.println("FIN DEL PROGRAMA");
	}
}
