package modelo.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import modelo.entidad.Usuario;

public class DaoUsuarioFichero {
	private static final String NOMBRE_FICHERO = "usuarios.dat";

	public Usuario getByName(String nombre) throws Exception {

		Usuario usuario = null;
		try {
			FileReader fr = new FileReader(NOMBRE_FICHERO);
			BufferedReader br = new BufferedReader(fr);
			String cadena = br.readLine();

			while (cadena != null) {
				String[] cadenaPartida = cadena.split("/");
				String nombreUsuario = cadenaPartida[0];
				String passwordUsuario = cadenaPartida[1];
				if (nombre.equals(nombreUsuario)) {
					usuario = new Usuario();
					usuario.setNombre(nombreUsuario);
					usuario.setPassword(passwordUsuario);
					return usuario;
				}
				cadena = br.readLine();
			}
			return null;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void registrar (Usuario u) throws Exception{
		
		File f = new File(NOMBRE_FICHERO);
		if (!f.exists()) {
			throw new Exception ("Fichero no existe");
		}	
		try {
			FileWriter fw = new FileWriter(NOMBRE_FICHERO,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(u.toString());
		} catch (Exception e) {
			throw e;
		}
		
			
			
			
		}

	}	
