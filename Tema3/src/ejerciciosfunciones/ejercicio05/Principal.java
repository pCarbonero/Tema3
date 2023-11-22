package ejerciciosfunciones.ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variable para el numero del que queremos saber la tabla
		int num;
		//escaner 
		Scanner sc = new Scanner(System.in);
		
		//pedimos el número
		System.out.println("Dime un número y te diré su tabla de multiplicar ");
		//guardamos el num en la variable num
		num = sc.nextInt();
		
		System.out.println("La tabla de multiplicar de " + num + " es: ");
		//llamamos a la funcion y le pasamos como parámetro el valorde num
		Tabla.multiplicar(num);
		
		//cerramos el escaner
		sc.close();

	}

}
