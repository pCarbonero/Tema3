package sobrecargafunciones.ejercicio02;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// Variable para los numeros
		int med1, med2, num1, num2, num3;
		int media1, media2;
		Scanner sc = new Scanner(System.in);

		// preguntamos al usuario por los valores
		System.out.println("Dime el primer número entero ");
		// guardamos el valor introducido en la variable
		med1 = sc.nextInt();
		// preguntamos al usuario por los valores
		System.out.println("Dime el segundo número entero ");
		// guardamos el valor introducido en la variable
		med2 = sc.nextInt();

		// igualamos la variable al return de la funcion que es la media de los dos
		// numeros
		media1 = Media.media(med1, med2);

		//imprimimos el resultado
		System.out.println("La media de los tres primeros números es " + media1);

		
		// preguntamos al usuario por los valores
		System.out.println("Dime el primer número entero ");
		// guardamos el valor introducido en la variable
		num1 = sc.nextInt();
		// preguntamos al usuario por los valores
		System.out.println("Dime el segundo número entero ");
		// guardamos el valor introducido en la variable
		num2 = sc.nextInt();
		System.out.println("Dime el segundo número entero ");
		// guardamos el valor introducido en la variable
		num3 = sc.nextInt();

		// igualamos la variable al return de la funcion que es la media de los tres
		// numeros
		media2 = Media.media(num1, num2, num3);
		
		//imprimimos el resultado
		System.out.println("La media de los tres primeros números es " + media2);
		
		//cerramos el escaner 
		sc.close();
		

	}

}
