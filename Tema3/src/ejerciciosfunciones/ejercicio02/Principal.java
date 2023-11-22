package ejerciciosfunciones.ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//variables para los numeros enteros
		int a=0 , b = 0;
		// scanner
		Scanner sc = new Scanner(System.in);
		
		//pedimos los números y los guaradamos en las variables
		System.out.println("Dime el numero a ");
		a = sc.nextInt();
		System.out.println("Dime b ");
		b = sc.nextInt();
			
		//comprobamos que número es mayor y en funcion de cual sea cambiamos el orden de los parametros
		if (a > b) {
			Enteros.numeros(b, a);
		}
		else {
			Enteros.numeros(a, b);
		}
		//cerramos el escaner		
		sc.close();
	}

}
