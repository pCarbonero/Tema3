package ejerciciosfunciones.ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// varaibles
		int opcion, radio, altura, res;
		
		//escaner
		Scanner sc = new Scanner(System.in);
		
		
		//preguntamos altura
		System.out.println("Dime la altura ");
		altura = sc.nextInt();
		//preguntamos radio
		System.out.println("Dime el radio del cilindro");
		radio = sc.nextInt();
		
		//preguntamos por la opcion que quiere el user
		System.out.println("Qué quieres hacer?: ");
		System.out.println("1.ÁREA ");
		System.out.println("2.VOLUMEN ");
		opcion = sc.nextInt();
		
		res = Calculo.areaVol(opcion, radio, altura);
		
		if (opcion == 1) {
			System.out.println("El área es: " + res);
		}
		if (opcion == 2) {
			System.out.println("El volumen es: " + res);
		}
		
		sc.close();

	}

}
