package ejerciciosfunciones.ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variables 
		int contador = 0, num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ESCRIBE UN NÚMERO ");
		num = sc.nextInt();
		
		contador = Divisores.contadorDivisores(num);
		
		System.out.println("El número " + num + " tiene " + contador + " divisores primos");
		sc.close();

	}

}
