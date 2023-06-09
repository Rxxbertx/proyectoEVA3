 package model;

import java.util.HashMap;
import java.util.Map.Entry;

public class ModeloVideojuego {

	private static HashMap<String, Videojuego> videojuegos = new HashMap<>();

	/**
	 * @param videojuegos
	 */
	public ModeloVideojuego(HashMap<Integer, Videojuego> videojuegos) {
		videojuegos = new HashMap<>();
	}

	public HashMap<String, Videojuego> getVideojuegos() {
		return videojuegos;
	}

	public static void altaJuego(Videojuego videojuego) {

		videojuegos.put(videojuego.getId(), videojuego);

	}

	public static void bajaJuego(Videojuego videojuego) {
		videojuegos.remove(videojuego.getId(), videojuego);
	}


	public static Videojuego consultarJuegos(Videojuego videojuego, String nombre) {

		for (Entry<String, Videojuego> entry : videojuegos.entrySet()) {
			Videojuego val = entry.getValue();
			if (val.getNombre().equals(nombre)) {
				return val;
			}

		}
		return null;

	}

}
