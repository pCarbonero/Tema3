package ejerciciosfunciones.ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variables
		int num;
		boolean isPrimo;
		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número ");
		num = sc.nextInt();
		
		isPrimo = Primo.isPrimo(num);
		
		if (isPrimo) {
			System.out.println("El número " + num + " es primo");
		}
		else {
			System.out.println("El número " + num + " no es primo");
		}
		
		sc.close();
	}
}
