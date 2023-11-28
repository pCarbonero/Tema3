package sobrecargafunciones.ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// variable para los número enteros
		int numInt1, numInt2;
		// variables para los números doubles
		double numDo1, numDo2;
		//varaibles para guardar lso resultados
		int sumaInt;
		double sumaDouble;
		// creamos el escaner para guardar los datos introducidos por pantalla
		Scanner sc = new Scanner(System.in);

		// preguntamos al usuario por los valores
		System.out.println("Dime el primer número entero ");
		// guardamos el valor introducido en la variable 
		numInt1 = sc.nextInt();
		// preguntamos al usuario por los valores
		System.out.println("Dime el segundo número entero ");
		// guardamos el valor introducido en la variable 
		numInt2 = sc.nextInt();
		
		//igualamos la variable al return de la funcion que es la suma de los dos numeros
		sumaInt = Sumas.suma(numInt1, numInt2);
		
		// preguntamos al usuario por los valores
		System.out.println("Dime el primer número decimal ");
		// guardamos el valor introducido en la variable 
		numDo1 = sc.nextDouble();
		// preguntamos al usuario por los valores
		System.out.println("Dime el segundo número decimal ");
		// guardamos el valor introducido en la variable 
		numDo2 = sc.nextDouble();
		
		//igualamos la variable al return de la funcion que es la suma de los dos numeros
		sumaDouble = Sumas.suma(numDo1, numDo2);
		
		//imprimimos el resultado
		System.out.println("La suma de los enteros es " + sumaInt);
		System.out.println("lA suma de los decimales es " + sumaDouble);
		
		//cerramos el escaner
		sc.close();	
	}

}
