package ejerciciosfunciones.ejercicio09;

public class Calculadora {
	
	public static int Calculator(int num1, int num2, int option){
		int res = 0;
		
		switch (option) {
		case 1: {
			res = num1 + num2;		
			break;
		}
		case 2: {
			res = num1 - num2;		
			break;
		}
		case 3: {
			res = num1 * num2;		
			break;
		}
		case 4: {
			res = num1 / num2;		
			break;
		}
		default:
			System.out.println("ERROR");
		}
		
		return res;
	}

}
