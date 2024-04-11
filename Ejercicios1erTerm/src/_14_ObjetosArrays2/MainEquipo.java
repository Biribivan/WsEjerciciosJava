package _14_ObjetosArrays2;

public class MainEquipo {
	public static void main(String[] args) {
		Equipo[] equipos= new Equipo[2];
		String[] jugadoresEquipo1= {"Reyna", "Cristiano", "Messi", 
				"Aurelio", "Jordi Wild", "Ramón", "Cristobal", "Mariano"};
		String[] jugadoresEquipo2= {"Lolo", "Carlos", "Pepe Viyuela"};
		
		equipos[0]=new Equipo("Atlético de Madrid", jugadoresEquipo1);
		equipos[1]=new Equipo("Real Sociedad", jugadoresEquipo2);
		
		for(Equipo e : equipos) {
			System.out.println("0---------0");
			System.out.println("Método toString:" + e);
			System.out.println("---------------------------------------");
			System.out.println("Mostrar todos los jugadores: " );
			e.mostrarJugadores();
			System.out.println("---------------------------------------");
			System.out.println("Devolver si existe un jugador  :" +e.existeJugador("Raul"));
			
			System.out.println("---------------------------------------");
			System.out.println("Devolver número de jugadores  :" +e.cantidadJugadores());
			
			System.out.println("---------------------------------------");
			System.out.println("Devolver si el equipo es apto para jugar  :" +e.esAptoParaJugar());
			
			System.out.println("---------------------------------------");
			System.out.println("Devolver si la lista es exactamente igual :" +e.listasIguales(jugadoresEquipo2));
			
			System.out.println("---------------------------------------");
			System.out.println("Devolver si el equipo es exactamente igual :" +e.equipoIguales("Real Madrid", jugadoresEquipo1));
		}
	}
}
