package funcionesatributos.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// creamos el escaner que recogerá el valor insertado
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opc;
		double num1, num2, res = 0;
		//creamos una variable de la clase OPeraciones para crear un objeto mas tarde
		Operaciones op;
		// mostramos el menú
		opc = menu();
		// pedimos los números para operar
		num1 = pideNumero();
		num2 = pideNumero();
		
		//creamos un objeto de la clase para llamar a las funciones de esta
		op = new Operaciones(num1, num2);
		
		//switch que dependiendo del valor de opc llamará a una funcion distinta o imprimirá mensaje de fin
		switch (opc) {
		case 1: {
			res = op.suma();
			break;
		}
		case 2: {
			res = op.resta();
			break;
		}
		case 3: {
			res = op.multiplicacion();
			break;
		}
		case 4: {
			res = op.division();
			break;
		}
		case 5: {
			res = op.max();
			break;
		}
		case 6: {
			res = op.min();
			break;
		}
		default:
			System.out.println("Has salido ");
		}
		
		System.out.println("El resultado es " + res);
	}// fin main()

	// creamos la función menú que nos la mostrará y nos pedirá que elijamos una
	// opcion
	public static int menu() {
		// creamos una variable int que será el valor que devolveremos
		int opc = 0;

		// mostramos el menú
		System.out.println("MENU: ");
		System.out.println("1. Suma\r\n" + "2. Resta\r\n" + "3. Multiplicación\r\n" + "4. División\r\n"
				+ "5. Máximo\r\n" + "6. Mínimo\r\n" + "0. Salir\r\n");
		do {
			try {
				System.out.println("Elige que quieres hacer ");
				// guardamos el valor introducido en la variable opc
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor incorrecto introdúcelo otra vez ");
				sc.nextLine();
			}
		} while (opc < 0 || opc > 6);


		// devolvemos el valor de la variable opc
		return opc;
	}// fin menu()

	// creamos la funcion double que nos pide que introduzcamos un número
	public static double pideNumero() {
		// creamo variable num
		double num = 0;
		boolean isOk = false;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// pedimos el número al usuario
				System.out.println("Introduce un número ");
				num = sc.nextDouble();
				isOk = true;
			} catch (InputMismatchException e) {
				// imprimimos mensaje de error
				System.out.println("Valor incorrecto, introdúcelo otra vez ");
			}

		} while (!isOk);

		// deviolvemos el valor de la variable num
		return num;
	}

}// fin menu
