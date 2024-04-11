package _03_ConversionesyCastngs;

public class ejercicio {

	public static void main(String[] args) {
		//De entero a float
		
		int numeroEntero=22;
		float numeroFloat=numeroEntero;
		System.out.println(numeroFloat);
		//Lo que esta en la caja pequeña siempre entra en uyna grande
		//No hace falta hacer casting, ni se pierde info.
		
		//De float a long
		numeroFloat=2F;
		//Siempre que queamos pasra lo que haya en un acaja grande a
		//una caja pequeña, es obligatorio hacer un casting. NO importa que el
		//valor que tenga la caja grande entre en la pequeña	
		
		//De double a entero
		double numeroDouble=3.3;
		int numeroEntero3 = (int)numeroDouble;
		System.out.println(numeroEntero3);
		//Deja hacer casting pero pierde el valor decimal
		
		
		//De entero a double
		numeroEntero3=25;
		double numeroDouble2=numeroEntero3;
		System.out.println(numeroDouble2);
		//Se puede hacer sin casting y no puierde informacion
		
		//De char a Entero
		
		char variableChar='a';
		int numeroEntero4=variableChar;
		System.out.println(numeroEntero4);
		//Se puede hacer sin casting, transforma de código ascii a cvaracter
		
		//De enteros a Char
		numeroEntero4=99;
		char variableChar2=(char)numeroEntero4;
		System.out.println(variableChar2);
		//Se puede hacer por casting 
		
		//De cadenas A eNTEROS
		String VARIABLEsTRING1="s";
	}

}
