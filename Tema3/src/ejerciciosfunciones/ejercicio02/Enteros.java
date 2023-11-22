package ejerciciosfunciones.ejercicio02;


public class Enteros {
	//creamos la función que recibe dos parametros de num enteros
	public static void numeros(int a, int b) {
		//creamos la variable num
		int num = 0;
		//bucle que imprimirá los números comprendidos entre los parametros introducidos
		for (int i = a+1; i < b; i++) {
			num = i;	
			System.out.println(num);
		}
	}

}
