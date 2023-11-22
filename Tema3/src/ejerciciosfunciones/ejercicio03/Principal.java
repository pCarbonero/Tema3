package ejerciciosfunciones.ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variable para guardar los dos números enteros
		int a, b, res;
		
		//variable para guardar el escaner 
		Scanner sc = new Scanner(System.in);
		
		//pedimos los números y los guardamos en ls variables
		System.out.println("Dime el primer número ");
		a = sc.nextInt();
		System.out.println("Dime el segundo número ");
		b = sc.nextInt();
		
		
		//igualamos la variable resultado a al valor que devuelve la funcion
		res = Maximo.max(a, b);
		//imprimimos el resultado
		System.out.println(res);
		//cerramos el escaner
		sc.close();
	}

}
