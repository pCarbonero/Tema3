package ampliacionfunciones.ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// creamos un scanner estático para poder usarlo en cualquier lugar de la clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable para guardar el radio de la esfera
		double radio;
		// creamos una variable int para guardar la opción del menu
		int opcion;
		//creamos una variable para guardar el resultado de la operación elegida
		double resultado;
		// creamos una variable de la clase para poder crearle un objeto
		Esfera sp;
		
		//llamamos a la funcion pideRadio e igualamos el valor que devuelve a la variable radio
		radio = pideRadio();
		//llamamos a la funcion menu e igualamos el valor que devuelve a la variable opcion
		opcion = menu();
		
		//creamos un objeto de la clase Esfera
		sp = new Esfera(radio);
		//creamos un switch que dependoiendo del valor de option hará una cosa
		switch (opcion) {
		case 1: {			
			resultado = sp.superficie();
			System.out.println("La superficie es " + resultado);
			break;
		}
		case 2: {
			resultado = sp.volumen();
			System.out.println("El volumen es " + resultado);
			break;
		}
		
		default:
			System.out.println("Has salido ");
		};
	}// fin main

	// creamos una funcion para crear el menú
	static int menu() {
		// variable para guardar la opcion elegida por el usuario
		int opcion = -1;// se iguala a -1 para que el bucle do while funcione correctamente

		// bucle para cuando el usuario introduzca un valor incorrecto vuelva a pedirle
		// el número
		do {
			try {
				// mostramos al usuario el menú
				System.out.println("MENU");
				System.out.println("1. Superficie\r\n" + "2. Volumen\r\n" + "0. Salir\r\n" + "");
				// guardamos el valor introducido en la variable opcion
				opcion = sc.nextInt();
				// Limpiamos el escaner
				sc.nextLine();

			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor introducido no válido ");
				// Limpiamos el Scanner
				sc.nextLine();
			}
		} while (opcion < 0);

		// devolvemos el valor de opcion
		return opcion;
	}

	// creamos una función para preguntar por el radio
	static double pideRadio() {
		// creamos la variable que va a almacenar el valor del radio
		double radio = -1;// se iguala a -1 para que el bucle do while funcione correctamente

		// bucle do while para que si el valor intoducido no está entre las opciones el
		// usuario tenga que volver a introducirlo
		do {
			try {
				// preguntamos por el radio del cilindro
				System.out.println("Dime el radio de la esfera ");
				radio = sc.nextDouble();
				// Limpiamos el escaner
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				// Limpiamos el escaner
				sc.nextLine();
			}
		} while (radio < 0);

		// devolvemos el valor con la que acabe la funcion la variable radio
		return radio;
	}// fin pideRadio()
}// fin class
