package ejerciciosfunciones.ejercicio03;

public class Maximo {

	//creamos la funcion que recibe dos parámetros
	public static int max(int a, int b) {
		int numMax = 0;
		
		numMax = (a > b) ? a : b;
		
		return numMax;
	}
}
