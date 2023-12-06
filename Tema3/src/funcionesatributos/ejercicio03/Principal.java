package funcionesatributos.ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// variable para guardar la opcion del menu
		int opcion;
		// variables para guardar el alto y el ancho del rectandulo
		double radio;
		// creamos variable para guardar el resultado de las operaciones
		double res;
		//creamos una variable de la clase círculo  para poder crear un objeeto de la clase
		Circulo cl;
		
		//llamamos a la funcion pideRadio e igualamos el valor que devuelve con la variable radio
		radio = pideRadio();
		//llamamos a la funcion del menu e igualamos el valor que devuelve con la variable opcion
		opcion = menu();
		
		//creamos un objeto de la clase Círculo para llamar a sus funciones
		cl = new Circulo(radio);
		
		switch (opcion) {
		case 1: {			
			res = cl.circunferencia();
			System.out.println("El perímetro es " + res);
			break;
		}
		case 2: {
			res = cl.area();
			System.out.println("El área es " + res);
			break;
		}
		
		default:
			System.out.println("Has salido ");
		};
		
		

	}//fin main
	
	//funcion menu() que imprime el menu y devuelve la opcion elegida
	public static int menu() {
		int opc =-1;
		
		//bucle do while para que si el valor intoducido no está entre ls opciones el usuario tenga que volver a introducirlo
		do {
			try {
				System.out.println("MENU");
				System.out.println("1. Perímetro\r\n"
						+ "2. Área\r\n"
						+ "0. Salir\r\n"
						+ "");
				opc = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Inprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				sc.nextLine();
			}
			
		} while (opc < 0 || opc > 3);

		return opc;
	}
	
	//funcion pide radio que pide el radio y devuelve el valor de este
	public static double pideRadio() {
		double radio = -1;
		
		//bucle do while para que si el valor intoducido no está entre ls opciones el usuario tenga que volver a introducirlo
		do {
			try {
				System.out.println("Dime el radio de una circunferencia ");
				radio = sc.nextDouble();
			} catch (InputMismatchException e) {
				// Inprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				sc.nextLine();
			}
		} while (radio<0);
		return radio;
	}//fin pideRadio

}
