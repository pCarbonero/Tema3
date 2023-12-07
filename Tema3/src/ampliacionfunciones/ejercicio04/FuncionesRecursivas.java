package ampliacionfunciones.ejercicio04;

public class FuncionesRecursivas {

	// creamos una función que devolverá la suma de todos los números entre 1 y el
	// valor de la variable numero
	public static int sumatorio(int numero) {
		// creamos una variable donde se guardará la suma de los números
		int suma = 0;

		// creamos un bucle que sumará la variable suma con i en cada iterción
		for (int i = 1; i <= numero; i++) {
			// igualamos a suma al valor de suma + i
			suma = suma + i;
		} // fin for

		// devolvemos el valor de suma
		return suma;
	}

	// creamos una función que realiza a^n
	public static double potencia(double a, double n) {
		// devolvemos el valor de a^n
		return Math.pow(a, n);
	}

	// creamos una función que devuelve el enésimo término de la serie de Fibonacci 
	public static int serieFibonacci(int numero) {
		// los dos primeros términos de la serie de Fibonacci son 1
		if (numero == 0 || numero == 1) {
			return 1;
		// para el resto de términos hacemos el cálculo
		} else {
			return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}
	}

}
