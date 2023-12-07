package ampliacionfunciones.ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// creamos una variable static del scanner para poder usarlo en cualquier lugar
	// de la clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos una variable para guardar la longitud del lado
		int lado = 0;
		// creamos una variable para guardar el carácter con el que se dibujará la
		// figura
		char caracter = ' ';
		// creamos una variable para guardar el valor de la opcion
		int opcion;
		// creamos una variable de la clase Figuras para más tarde poder crear un objeto
		Figuras fig;

		// llamamos a la función pideLado() e igualamos la variable lado al valor que
		// devuelve
		lado = pideLado();

		// llamamos a la función pideCaracter() e igualamos la variable caracter al
		// valor que devuelve
		caracter = pideCaracter();
		
		// llamamos al menú e igualamos la variable opcion al valor que devuelve
		opcion = menu();


		// creamos un objeto de la clase para poder acceder a las funciones de la clase
		fig = new Figuras(lado, caracter);

		// creamos un switch que dependoiendo del valor de option hará una cosa
		switch (opcion) {
		case 1: {
			fig.triangulo();
			break;
		}
		case 2: {
			fig.cuadrado();
			break;
		}
		case 3: {
			fig.hexagono();
			break;
		}

		default:
			System.out.println("Has salido ");
		}
		;

	}

	public static int menu() {
		// creamos la variable que va a almacenar el valor de la opción elegida
		int option = -1; // se iguala a -1 para que el bucle do while funcione correctamente

		// bucle que siempre que el valor de option sea menor de 0 o mayor de 3(es decir
		// que no se ha intorudcido una opcion correcta) se repita
		do {
			// creamos un try catch para preguntar por la opción y para imprimir mensaje de
			// error si es necesario
			try {
				// imprimimos el menú
				System.out.println("MENU");
				System.out.println("1. Triángulo\r\n" + "2. Cuadrado\r\n" + "3. Hexágono\r\n" + "0. Hexágono\r\n" + "");
				// guardamos el valor introducido en la variable option
				option = sc.nextInt();
				// Limpiamos el escaner
				sc.nextLine();

			} catch (InputMismatchException e) {
				// Imprimimos mensaje de error
				System.out.println("Valor introducido incorrecto ");
				// Limpiamos el escaner
				sc.nextLine();
			} // catch
		} while (option < 0 || option > 4);

		// devolvemos el valor con la que acabe la funcion la variable option
		return option;
	}// fin menu()

	// creamos una función que nos pedirá el lado de la figura
	public static int pideLado() {
		int lado = 0;

		// bucle que si el usuario no introduce un valor válido se repetirá
		do {
			// try catch por si el usuario introduce un valor qeu no es de tipo int
			try {
				// preguntamos al usuario por la longitud del lado
				System.out.println("Cuánto mide el lado? ");
				lado = sc.nextInt();
				// limìamos el scanner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos mensaje de error
				System.out.println("Valor incorrecto ");
				// limìamos el scanner
				sc.nextLine();
			}
		} while (lado <= 1);
		// devolvemos el valor de lado
		return lado;
	}// fin pideLado

	// creamos una función que nos pedirá con que carácter quiere que dibujemos la
	// figura
	public static char pideCaracter() {
		char caracter = ' ';

		// // bucle que si el usuario no introduce un valor válido se repetirá
		do {
			try {
				System.out.println("Qué carácter quieres utilizar para la figura? ");
				caracter = sc.next().charAt(0);
				// limìamos el scanner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos mensaje de error
				System.out.println("Valor incorrecto ");
				// limìamos el scanner
				sc.nextLine();
			}
		} while (caracter == ' ');

		return caracter;
	}

}
