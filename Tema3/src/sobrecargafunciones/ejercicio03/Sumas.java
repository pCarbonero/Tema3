package sobrecargafunciones.ejercicio03;



public class Sumas {

	public static int sumaEnteros(int numero){
		int num = 0;
		
		for (int i = 1; i <= numero; i++) {
			num = num + i;		
		}
		
		return num;
	}
	
	public static int sumaEnteros(int numero1, int numero2){
		int num = 0;
		int numA, numB;
		
		numA = (numero1>numero2) ? numero1 : numero2;
		numB = (numero1<numero2) ? numero1 : numero2;
		
		for (int i = numB; i <= numA; i++) {
			num = num + i;		
		}
		
		return num;
	}
}
