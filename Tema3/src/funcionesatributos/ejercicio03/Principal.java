package funcionesatributos.ejercicio03;

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
		
		Circulo cl;
		
		//llamamos a la funcion pideRadio e igualamos el valor que devuelve con la variable radio
		radio = pideRadio();
		//llamamos a la funcion del menu e igualamos el valor que devuelve con la variable opcion
		opcion = menu();
		
		cl = new Circulo(radio);
		
		switch (opcion) {
		case 1: {
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}

	}
	
	//funcion menu() que imprime el menu y devuelve la opcion elegida
	public static int menu() {
		int opc;
		System.out.println("MENU");
		System.out.println("1. Perímetro\r\n"
				+ "2. Área\r\n"
				+ "0. Salir\r\n"
				+ "");
		opc = sc.nextInt();
		return opc;
	}
	
	//funcion pide radio que pide el radio y devuelve el valor de este
	public static double pideRadio() {
		double radio;
		System.out.println("Dime el radio de una circunferencia ");
		radio = sc.nextDouble();
		return radio;
	}

}
