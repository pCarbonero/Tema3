package ampliacionfunciones.ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// creamos la variable para guardar la cantidad de numeros generados
		int cantidad;
		// creamos las variables para guardar el número máximo y mínimo
		int max, min;
		// creamos un Scanner para guardar en als variables valores insertados por consola
		Scanner sc = new Scanner(System.in);
		
		//preguntamos por la cantidad de números generados en la primera tanda
		System.out.println("¿Cuántos números quieres generar entre 0 y 1 ?");
		//guardamos la cantidad deseada en la variable cantidad
		cantidad = sc.nextInt();
		//llamamos a la función deseada que imprimirá los números por consola
		NumerosAleatorios.numerosAleatorios(cantidad);
		
		//preguntamos por la cantidad de números generados en la segunda tanda
		System.out.println("¿Cuántos números quieres generar en la segunda tanda ?");
		//guardamos la cantidad deseada en la variable cantidad
		cantidad = sc.nextInt();
		//preguntamos cual quiere que sea el número maximo que se pueda generar
		System.out.println("Dime que número es el máximo que se pueda generar ");
		//guardamos el valor insertado en la variable max
		max = sc.nextInt();
		//llamamos a la función deseada que imprimirá los números por consola
		NumerosAleatorios.numerosAleatorios(cantidad, max);
		
		//preguntamos por la cantidad de números generados en la segunda tanda
		System.out.println("¿Cuántos números quieres generar en la segunda tanda ?");
		//guardamos la cantidad deseada en la variable cantidad
		cantidad = sc.nextInt();
		//preguntamos cual quiere que sea el número maximo que se pueda generar
		System.out.println("Dime que número es el máximo que se pueda generar ");
		//guardamos el valor insertado en la variable max
		max = sc.nextInt();
		//preguntamos cual quiere que sea el número mínimo que se pueda generar
		System.out.println("Dime que número es el mínimo que se pueda generar ");
		//guardamos el valor insertado en la variable min
		min = sc.nextInt();
		//llamamos a la función deseada que imprimirá los números por consola
		NumerosAleatorios.numerosAleatorios(cantidad, max, min);
		
		sc.close();

	}

}
