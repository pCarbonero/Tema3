package ampliacionfunciones.ejercicio03;

import java.util.Random;

public class NumerosAleatorios {
	//creamos un objeto de la clase Random estático para poder acceder a sus métodos desde cualquier funcion de esta clase
	static Random random = new Random();
	
	// creamos una función que generará la cantidad solicitada de numeros aleatorios entre 0 y 1
	public static void numerosAleatorios(int cantidad) {		
		// creamos una variable para guardar el número aleatorio generado en cada iteración del bucle
		int num;
	
		// bucle for que generará la cantidad de números aleatorios deseados
		for (int i = 1; i <= cantidad; i++) {
			// igualamos la variable num a un número aleatorio entre 0 incuido y 2 excluido
			num = random.nextInt(0, 2);
			// imprimimos el número al final de la iteración
			System.out.println(num);
		}
	}
	
	// creamos una función que generará la cantidad solicitada de numeros aleatorios entre 0 y el numero maximo indicado
	public static void numerosAleatorios(int cantidad, int max) {
		// creamos una variable para guardar el número aleatorio generado en cada iteración del bucle
		int num;
		
		// bucle for que generará la cantidad de números aleatorios deseados
		for (int i = 1; i <= cantidad; i++) {
			// igualamos la variable num a un número aleatorio entre 0 incuido y el numero maximo excluido
			num = random.nextInt(1, max+1);
			// imprimimos el número al final de la iteración
			System.out.println(num);
		}
	}
	
	// creamos una función que generará la cantidad solicitada de numeros aleatorios entre el numero minimo y maximo indicado
	public static void numerosAleatorios(int cantidad, int max, int min) {
		// creamos una variable para guardar el número aleatorio generado en cada iteración del bucle
		int num;
		
		// bucle for que generará la cantidad de números aleatorios deseados
		for (int i = 1; i <= cantidad; i++) {
			// igualamos la variable num a un número aleatorio entre el numero minimo incuido y el numero maximo excluido
			num = random.nextInt(min, max+1);
			// imprimimos el número al final de la iteración
			System.out.println(num);
		}
	}

}
