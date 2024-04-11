package _14_ObjetosArrays2;

import java.util.Arrays;

public class Equipo {
	public String nombre;
	public String[] listaJugadores;
	
	
	public Equipo(String nombre, String[] listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}

	public Equipo() {
		super();
	}
@Override
	public String toString() {
		final int maxLen = 10;
		return "Equipo [nombre=" + nombre + ", listaJugadores="
				+ (listaJugadores != null
						? Arrays.asList(listaJugadores).subList(0, Math.min(listaJugadores.length, maxLen))
						: null)
				+ "]";
	}
	
	public void mostrarJugadores() {
		for(String s : listaJugadores) {
			System.out.println(s);
		}
	}
	 public boolean existeJugador(String jugador) {
		  for(String s : listaJugadores) {
			  if(s.equalsIgnoreCase(jugador)) {
				  return true;
			  }
		  }return false;
		//return listaJugadores.contains(jugador);
	 }
	 
	 public int cantidadJugadores() {
		 int contador=0;
		 for(String s : listaJugadores) {
			 contador++;
		 }
		 return contador;
	 }
	 
	 public boolean esAptoParaJugar() {
		 if(cantidadJugadores()>=7) {
			 return true;
		 }return false;
	 }
	
	 
	 public boolean listasIguales(String[] otroEquipo) {
		 if(listaJugadores.length!=otroEquipo.length) {
			 return false;
		 }else {
			 for(String s:otroEquipo) {
				 if(!existeJugador(s)) {
					 return false;
				 }
			 }
		 }
		 return true;
	 }
	 
	 public boolean equipoIguales(String otroNombre, String[] otroEquipo) {
		 if(!listasIguales(listaJugadores)) {
			 return false;
			 
		 }else {
			 if(!this.nombre.equalsIgnoreCase(otroNombre)) {
				 return false;
			 }
		 }return true;
	 }
}

















