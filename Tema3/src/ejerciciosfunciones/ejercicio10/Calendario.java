package ejerciciosfunciones.ejercicio10;

public class Calendario {
	
	public static boolean comprobador(int dia, int mes, int anyo) {
		boolean isCorrect = false;
		
		if (dia < 31 && dia > 0 && mes < 13 && mes > 0) {
			isCorrect = true;
		}	
		return isCorrect;	
	}

}
