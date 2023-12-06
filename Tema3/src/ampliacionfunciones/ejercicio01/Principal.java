package ampliacionfunciones.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variable para almacenar el numero introducido por el usuario
		int numero = -1; //igualamos el numero a 0 para que el bucle do while funcione correctamente
		// creamos un scanner para introducir un número solicitdao al usuario
		Scanner sc = new Scanner(System.in);
		//creamos booleanas para saber si es capicua y primo
		boolean esPrimo, esCapicua;
		//creamos una variable de la clase Numeros
		Numeros num;
		
		//bucle para que si el usuario introduce un dato erroneo vuleva a pedirle un número
		do {
			try {
				//preguntamos al usuario por un número entero
				System.out.println("Dime un número entero ");
				//guardamos el número dentro de la variable numero
				numero = sc.nextInt();
				//limpiamos el Scanner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimnos un mesnaje de error
				System.out.println("Valor introducido incorrecto ");
			}
		} while (numero < 0);
		
		//creamos un objeto de la clase Numeros	
		num = new Numeros(numero);
		// igualamos la variable esPrimo al valor devuelto de la funcion esPrimo de la funcion Numeros
		esPrimo = num.esPrimo();
		// igualamos la variable esCapicua al valor devuelto de la funcion esCapicua de la funcion Numeros
		esCapicua = num.esCapicua();
		
		//si el numero es capicua imprimos un mensaje infromando al usuario de que sí lo es
		if (esCapicua) {
			System.out.println("El número introducido es capicúa ");
		}
		//si el numero es no capicua imprimos un mensaje infromando al usuario de que no lo es
		else {
			System.out.println("El número introducido no es capicúa ");
		}
		
		//si el numero es primo imprimos un mensaje infromando al usuario de que sí lo es
		if (esPrimo) {
			System.out.println("El número introducido es primo ");
		}
		//si el numero es no primo imprimos un mensaje infromando al usuario de que no lo es
		else {
			System.out.println("El número introducido no es primo ");
		}
		
		//cerramos el escaner
		sc.close();
	}//fin main

}
