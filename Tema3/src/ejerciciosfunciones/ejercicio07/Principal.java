package ejerciciosfunciones.ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variables
		int num;
		boolean isPrimo;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuasrio un número
		System.out.println("Dime un número ");
		// guardamos el valor introducido en la variable num
		num = sc.nextInt();

		// llamamos a la funcion isPrimo que calcula si el numero es primo o no y lo
		// igualamos a la booleana boolean

		isPrimo = Primo.isPrimo(num);

		//si el numero es primo inmprimos el mensaje
		if (isPrimo) {
			System.out.println("El número " + num + " es primo");
		//si no lo es imprimimos otro
		} else {
			System.out.println("El número " + num + " no es primo");
		}
		//cerramos el escaner
		sc.close();
	}
}
