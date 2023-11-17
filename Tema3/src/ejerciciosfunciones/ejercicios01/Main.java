package ejerciciosfunciones.ejercicios01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creamos la variable para guardar un número
		int num;
		//creamos el escaner
		Scanner sc = new Scanner(System.in);
		//preguntamos por el número
		System.out.println("simnim");
		//guardamos el número introducido n la variable num
		num = sc.nextInt();
		
		//llamamos la funcion eco de la clase Eco y le pasamos el valor introducido a su variable int
		Eco.eco(num);
		
		//cerramos el escaner
		sc.close();
	}

}
