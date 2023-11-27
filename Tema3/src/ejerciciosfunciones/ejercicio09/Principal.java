package ejerciciosfunciones.ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//VARIABLES
		int res, option, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro número ");
		num2 = sc.nextInt();
		
		System.out.println("¿Qué operación quieres hacer? 1.Suma / 2.Resta / 3.Multiplicación / 4.División ");
		option = sc.nextInt();
		
		res = Calculadora.Calculator(num1, num2, option);
		
		System.out.println("El resultado es " + res);
		
		sc.close();

	}

}
