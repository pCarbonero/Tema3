package ejerciciosfunciones.ejercicio04;

public class Vocal {

	// creamos la funcion bool que va a comprobar si el caracter es una vocal o no
	public static boolean compVocal(String a) {
		// creamos la variable que vamos a devolver
		boolean isChar = false;

		// switch para comprobar si el valor es una vocal
		switch (a) {
		// en casi de que sea una de esas opciones la bool es true
		case "A", "a", "E", "e", "I", "i", "O", "o", "U", "u": {

			isChar = true;
			break;
		}
		// en cualquier otro caso es false
		default:
			isChar = false;
		}
		// devolvemos el valor de la bool
		return isChar;
	}
}
