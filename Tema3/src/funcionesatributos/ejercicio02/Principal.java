package funcionesatributos.ejercicio02;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//variable para guardar la opcion del menu
		int opcion;
		//variables para guardar el alto y el ancho del rectandulo
		double alto, ancho;
		//creamos variable para guardar el resultado de las operaciones 
		double res;
		//creamos on objeto de la clase rectangulo para poder llamar sus funcione
		Rectangulo rc;
		
		//llamamos a la funcion pideAlto e igualamos el valor que devuelve con la variable alto
		alto = pideAlto();
		//llamamos a la funcion pideAncho e igualamos el valor que devuelve con la variable ancho
		ancho = pideAncho();
		
		
		//llamamos a la funcion del menu e igualamos el valor que devuelve con la variable opcion
		opcion = menu();
		
		
		rc = new Rectangulo(alto, ancho);
		//creamos un switch que dependiendo de el valorde opcion hará una cosa u otra
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
	
	public static double pideAlto() {
		double alto;
		System.out.println("Dime el alto del rectángulo ");
		alto = sc.nextDouble();
		return alto;
	}
	
	public static double pideAncho() {
		double ancho;
		System.out.println("Dime el ancho del rectángulo ");
		ancho = sc.nextDouble();
		return ancho;
	}

}
