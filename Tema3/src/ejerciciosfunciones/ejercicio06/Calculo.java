package ejerciciosfunciones.ejercicio06;

public class Calculo {
	public static int areaVol(int opc, int radio, int altura) {
		int res = 0;
		
		if (opc == 1) {
			res = (int) ((int) 2*Math.PI*(altura+radio));
		}
		if (opc == 2) {
			res =  (int) (Math.PI * radio * altura);
		}
		
		return res;
	}
}
