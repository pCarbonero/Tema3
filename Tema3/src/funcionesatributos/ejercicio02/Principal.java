package funcionesatributos.ejercicio02;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable para guardar la opcion del menu
		int opcion;
		// variables para guardar el alto y el ancho del rectandulo
		double alto, ancho;
		// creamos variable para guardar el resultado de las operaciones
		double res;
		// creamos on objeto de la clase rectangulo para poder llamar sus funcione
		Rectangulo rc;

		// llamamos a la funcion pideAlto e igualamos el valor que devuelve con la
		// variable alto
		alto = pideAlto();
		// llamamos a la funcion pideAncho e igualamos el valor que devuelve con la
		// variable ancho
		ancho = pideAncho();

		// llamamos a la funcion del menu e igualamos el valor que devuelve con la
		// variable opcion
		opcion = menu();

		rc = new Rectangulo(alto, ancho);
		// creamos un switch que dependiendo de el valorde opcion hará una cosa u otra
		switch (opcion) {

		case 1: {
			res = rc.perimetro();
			System.out.println("El perímetro es " + res);
			break;
		}
		case 2: {
			res = rc.area();
			System.out.println("El area es " + res);
			break;
		}
		case 0: {
			System.out.println("Has salido ");
			break;
		}

		default:
			System.out.println("sjkopmkl");
		}

	}

	// creamos una función para impirmir el menú y guardar la opcion elegida
	public static int menu() {
		// creamos una variable apra guardar la opcion elegida
		int opc = -1; // igualamos el valor a -1 para que el bucle do while funcione correctamente

		// bucle que siempre que el valor de opc sea menor de 0 o mayor de 3(es decir
		// que no se ha intorudcido una opcion correcta) se repita
		do {
			// creamos un try catch para asegurarnos de que se introduce un valro válido
			try {
				// imprimimos el menú
				System.out.println("MENU");
				System.out.println("1. Perímetro\r\n" + "2. Área\r\n" + "0. Salir\r\n" + "");
				// guardamos el valor introducido en la variable opc
				opc = sc.nextInt();
				// limpiamos el escaner
				sc.nextLine();
			} catch (Exception e) {
				// imprimimos mesnaje de error
				System.out.println("Valor incorrecto ");
				// limpiamos el escaner
				sc.nextLine();
			}
		} while (opc < 0 || opc > 3);
		// devolvemos el valor de opc
		return opc;
	}

	// creamos una función para pedir el alto del rectángulo
	public static double pideAlto() {
		// variable para guardar el valor introducido
		double alto = -1;

		// bucle que siempre que el valor de alto sea menor de 0 se repita
		do {
			try {
				System.out.println("Dime el alto del rectángulo ");
				alto = sc.nextDouble();
				// limpiamos el escaner
				sc.nextLine();
			} catch (Exception e) {
				// imprimimos mensaje de error
				System.out.println("Valor introducido incorrecto ");
				// limpiamos el escaner
				sc.nextLine();
			}
		} while (alto < 0);

		// devolvemos el valor introducido
		return alto;
	}

	public static double pideAncho() {
		// variable para guardar el valor introducido
		double ancho = -1;
		// bucle que siempre que el valor de ancho sea menor de 0 se repita
		do {
			try {
				System.out.println("Dime el ancho del rectángulo ");
				ancho = sc.nextDouble();
				// limpiamos el escaner
				sc.nextLine();
			} catch (Exception e) {
				// imprimimos mensaje de error
				System.out.println("Valor introducido incorrecto ");
				// limpiamos el escaner
				sc.nextLine();
			}
		} while (ancho < 0);
		// devolvemos el valor de ancho
		return ancho;
	}

}
