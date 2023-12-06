package sobrecargafunciones.ejercicio05;

import java.util.Random;
import java.util.stream.IntStream;

public class Aleatorios {

	public static void numerosAleatorios(int cant) {
		Random random = new Random();
		int num;
		for (int i = 1; i <= cant; i++) {
			num = random.nextInt(0, 2);
			System.out.println(num);
		}
	}
	
	public static void numerosAleatorios(int cant, int max) {
		Random random = new Random();
		int num;
		for (int i = 1; i <= cant; i++) {
			num = random.nextInt(1, max);
			System.out.println(num);
		}
	}
	
	public static void numerosAleatorios(int cant, int max, int min) {
		Random random = new Random();
		int num;
		for (int i = 1; i <= cant; i++) {
			num = random.nextInt(min	, max);
			System.out.println(num);
		}
	}
}
