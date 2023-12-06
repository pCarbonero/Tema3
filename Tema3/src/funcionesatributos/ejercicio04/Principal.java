package funcionesatributos.ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	//creamos un scanner estático para poder usarlo en cualquier lugar en la clase
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// creamos una variable para guardar el valor de la opcion introducida
		int option;
		//creamos variables para los valores del radio y la altura
		double radio, altura;
		//creamos una variable para guardar el resultado de la operación elegida
		double answer;
		//creamos una variable de la clase cilindro para poder crear un objeto de la clase
		Cilindro cl;
		
		//llamamos a la función pide radio e igualamos el valor de la variable radio con el valor quela funcion devuelve
		radio = pideRadio(); 
		//llamamos a la función pideAltura e igualamos el valor de la variable altura con el valor que la funcion devuelve
		altura = pideAltura(); 
		//llamamos a la función menu e igualamos el valor de la variable option con el valor que la funcion devuelve
		option = menu(); 
		
		//creamos un onjeto de la clase cilindro para poder llamar a las funciones de la clase
		cl = new Cilindro(radio, altura);
		
		//creamos un switch que dependoiendo del valor de option hará una cosa
		switch (option) {
		case 1: {			
			answer = cl.volumen();
			System.out.println("El volumen87 es " + answer);
			break;
		}
		case 2: {
			answer = cl.area();
			System.out.println("El área es " + answer);
			break;
		}
		
		default:
			System.out.println("Has salido ");
		};

	}//fin main
	
	
	
	public static int menu() {
		//creamos la variable que va a almacenar el valor de la opción elegida
		int option = -1; // se iguala a -1 para que el bucle do while funcione correctamente
		
		//bucle que siempre que el valor de option sea menor de 0 o mayor de 3(es decir que no se ha intorudcido una opcion correcta) se repita
		do {
			//creamos un try catch para preguntar por la opción y para imprimir mensaje ed error si es necesario
			try {
				//imprimimos el menú
				System.out.println("MENU");
				System.out.println("1. Volumen\r\n"
						+ "2. Área\r\n"
						+ "0. Salir\r\n"
						+ "");
				//guardamos el valor introducido en la variable option
				option = sc.nextInt();
				//Limpiamos el escaner 
				sc.nextLine();
				
			} catch (InputMismatchException e) {
				// Imprimimos mensaje de error
				System.out.println("Valor introducido incorrecto ");
				//Limpiamos el escaner 
				sc.nextLine();
			}//catch
		} while (option < 0 || option > 3);
		
		//devolvemos el valor con la que acabe la funcion la variable option
		return option;
	}//fin menu()
		
	
	//creamos una función para preguntar por el radio de la base del cilindro
	public static double pideRadio() {
		//creamos la variable que va a almacenar el valor del radio
		double radio = -1;// se iguala a -1 para que el bucle do while funcione correctamente
		
		//bucle do while para que si el valor intoducido no está entre las opciones el usuario tenga que volver a introducirlo
		do {
			try {
				//preguntamos por el radio del cilindro
				System.out.println("Dime el radio del cilindro ");
				radio = sc.nextDouble();
				//Limpiamos el escaner 
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				//Limpiamos el escaner 
				sc.nextLine();
			}
		} while (radio<0);
		
		//devolvemos el valor con la que acabe la funcion la variable radio
		return radio;
	}//fin pideRadio()
	
	
	public static double pideAltura() {
		//creamos la variable que va a almacenar el valor del radio
		double altura = -1;// se iguala a -1 para que el bucle do while funcione correctamente
		
		//bucle do while para que si el valor intoducido no está entre las opciones el usuario tenga que volver a introducirlo
		do {
			try {
				//preguntamos por el radio del cilindro
				System.out.println("Dime la altura del cilindro ");
				altura = sc.nextDouble();
				//Limpiamos el escaner 
				sc.nextLine();
			} catch (InputMismatchException e) {
				// Imprimimos un mensaje de error
				System.out.println("Valor incorrecto ");
				//Limpiamos el escaner 
				sc.nextLine();
			}
		} while (altura<0);
		
		//devolvemos el valor con la que acabe la funcion la variable altura
		return altura;
	}//fin pideAltura()

}//fin clase
