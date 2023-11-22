package ejerciciosfunciones.ejercicio04;

public class Vocal {

	public static boolean compVocal(String a) {
		boolean isChar = false;
		
		switch (a) {
		case "A","a","E","e","I","i","O","o","U","u": {
			
			isChar = true;
		}
		default:
			isChar = false;
		}
		
		return isChar;
	}
}
