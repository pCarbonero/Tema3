package ampliacionfunciones.ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variable para guardar el número para realizar las operaciones del sumatorio y
		// el resultado
		int numSuma = 0, sumatorio;
		// variables para guardar el número para realizar las operaciones de la
		// potencia, su exponente y el resultado
		double numPo = -1, exponente = 0, potencia;
		// variable para guardar el número para realizar las operaciones de la sucesión
		// de fibonacci y el resultado
		int numFibonacci = -1, sucesion;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// creamos un bucle para asegurarnos de que el usuario introduce un número
		// correcto
		do {
			// creamos un try catch por si el usuario introduce un valor que no sea int
			try {
				// preguntamos por el número para realizar el sumatorio
				System.out.println("Dime un número ");
				numSuma = sc.nextInt();
				// vaciamos el Scanner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				// vaciamos el Scanner
				sc.nextLine();
			}
		} while (numSuma <= 1);
		// llamamos a la función que realiza el suamtorio e igualamos la variable
		// sumatorio al valor que devuelve la función
		sumatorio = FuncionesRecursivas.sumatorio(numSuma);
		
		//imprimimos el resultado
		System.out.println("Resultado del sumatorio " + sumatorio);
		
		
		// creamos un bucle para asegurarnos de que el usuario introduce un número
		// correcto
		do {
			// creamos un try catch por si el usuario introduce un valor que no sea double
			try {
				// preguntamos por el número de la base
				System.out.println("Dime un número para la base de una potencia ");
				numPo = sc.nextInt();			
				// preguntamos por el número del exponente
				System.out.println("Dime el exponente ");
				exponente = sc.nextInt();
				// vaciamos el Scanner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				// vaciamos el Scanner
				sc.nextLine();
			}
		} while (numPo < 0);
		// llamamos a la función que realiza el suamtorio e igualamos la variable
		// sumatorio al valor que devuelve la función
		potencia = FuncionesRecursivas.potencia(numPo, exponente);
		//imprimimos el resultado
		System.out.println("Resultado de la potencia " + potencia);
		
		// creamos un bucle para asegurarnos de que el usuario introduce un número
		// correcto
		do {
			// creamos un try catch por si el usuario introduce un valor que no sea double
			try {
				// preguntamos por el número de la base
				System.out.println("Dime un número para la sucesión ");
				numFibonacci = sc.nextInt();			
				// vaciamos el Scanner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				// vaciamos el Scanner
				sc.nextLine();
			}
		} while (numFibonacci < 0);
		// llamamos a la función que realiza el suamtorio e igualamos la variable
		// sumatorio al valor que devuelve la función
		sucesion = FuncionesRecursivas.serieFibonacci(numFibonacci);
		//imprimimos el resultado
		System.out.println("Resultado de la sucesión es " + sucesion);
		
		//cerramos el escaner
		sc.close();

	}

}
