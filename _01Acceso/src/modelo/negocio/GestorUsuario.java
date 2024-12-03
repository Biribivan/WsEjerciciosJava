package modelo.negocio;
import modelo.persistencia.DaoUsuarioFichero;
import modelo.entidad.Usuario;

public class GestorUsuario {
	private DaoUsuarioFichero duf;
	
	
	public int validar(Usuario u) {
		duf = new DaoUsuarioFichero();
		
		try {
			Usuario uFichero = duf.getByName(u.getNombre());
			if (uFichero == null) {
				return 0;
			}

			if (uFichero.equals(u)) {
				return 1;
			} else {
				return 2;
			}
		} catch (Exception e) {
			return 666;
		}
	}
		public int guardar(Usuario u) {
			if (u == null) {
				return 0;
			}

			duf = new DaoUsuarioFichero();
			try {
				if (u.getNombre().isBlank()) {
					return 1;
				} else if (u.getPassword().isBlank()) {
					return 2;
				} else {
					duf.registrar(u);
					return 3;
				}
			} catch (Exception e) {
				return 666;
			}

		
	}
}
 