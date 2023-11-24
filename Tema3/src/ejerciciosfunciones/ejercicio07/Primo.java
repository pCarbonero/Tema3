package ejerciciosfunciones.ejercicio07;


public class Primo {

	public static boolean isPrimo(int num) {
		boolean isP = true;
		
		for (int i = 2; i < Math.sqrt(num); i++) {			
			if (num%i == 0) {
				isP = false;
			}		
		}
		if (isP) {
			if (num == 1) {
				isP = false;
			}
		}		
		return isP;
	}
}
