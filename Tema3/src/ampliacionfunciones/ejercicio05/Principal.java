package ampliacionfunciones.ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// variables
		int lado;
		char caracter;
		Figuras fig; 
		
		lado = 4;
		caracter = '*';
		
		fig = new Figuras(lado, caracter);
		
		fig.cuadrado();
		

	}

}
