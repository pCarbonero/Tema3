package ejerciciosfunciones.ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variable para guardar lo introducido
		String in;
		// escaner
		Scanner sc = new Scanner(System.in);
		// pedimos al usuario que escriba po teclado
		System.out.println("Escribe una letra");
		// guardamos lo introducido en la variable in
		in = sc.nextLine();

		// lamamos a la funcion, si es true imprimimos que si es una vocal
		if (Vocal.compVocal(in)) {
			System.out.println("Es una vocal ");
			// si no imprimimos lo conrtrario
		} else {
			System.out.println("No es una vocal ");

		}
		// cerramos el escaner
		sc.close();
	}

}
