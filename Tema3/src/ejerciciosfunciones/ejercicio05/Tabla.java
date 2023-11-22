package ejerciciosfunciones.ejercicio05;


public class Tabla {

	public static void multiplicar(int a) {
		
		for (int i = 0; i <= 10; i++) {
			int mult;
			mult = a*i;
			System.out.println(a + " * " +  i + " = " + mult);			
		}
	}

}
