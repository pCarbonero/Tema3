package ejerciciosfunciones.ejercicio03;

public class Maximo {

	//creamos la funcion que recibe dos parámetros
	public static int max(int a, int b) {
		int numMax = 0;
		//igualamos la varaible al numero mayor de los dos parámetros
		numMax = (a > b) ? a : b;
		//devolvemos el numero mayor
		return numMax;
	}
}
