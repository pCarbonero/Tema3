package sobrecargafunciones.ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cantidad, max, min;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cant ");
		cantidad = sc.nextInt();
		
		System.out.println("Max ");
		max = sc.nextInt();
		
		System.out.println("Min ");
		min = sc.nextInt();
		
		Aleatorios.numerosAleatorios(cantidad);
		Aleatorios.numerosAleatorios(cantidad, max);
		Aleatorios.numerosAleatorios(cantidad, max, min);
		
		sc.close();
	}

}
