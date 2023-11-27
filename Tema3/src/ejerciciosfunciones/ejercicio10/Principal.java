package ejerciciosfunciones.ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variables
		int dia, mes, anyo;
		boolean isCorrect;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el día (dd/mm/aa) ");
		dia = sc.nextInt();
		
		System.out.println("Dime el mes (dd/mm/aa) ");
		mes = sc.nextInt();
		
		System.out.println("Dime el año (dd/mm/aa) ");
		anyo = sc.nextInt();
		
		isCorrect = Calendario.comprobador(dia, mes, anyo);
		
		if (isCorrect) {
			System.out.println("La fecha es correcta ");
		}
		else {
			System.out.println("La fecha es incorrecta ");
		}
		
		sc.close();
	}

}
