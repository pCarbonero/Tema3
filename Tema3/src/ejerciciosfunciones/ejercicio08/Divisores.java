package ejerciciosfunciones.ejercicio08;
import ejerciciosfunciones.ejercicio07.Primo;

public class Divisores {
	
	public static int contadorDivisores(int num) {
		int contador = 0;
		
		
		for (int i = 1; i <=num; i++) {
			
			if (num%i == 0) {
				//System.out.println("El divisor es " + i);
				if (Primo.isPrimo(i)) {
					contador++;
				}
			}		
		}
		return contador;
	}

}
