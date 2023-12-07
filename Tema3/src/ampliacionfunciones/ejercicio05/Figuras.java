package ampliacionfunciones.ejercicio05;


public class Figuras {
	// creamos un atributo para guardar la longitud de cada lafo
	int lado;
	// creamos un atributo para guardar el tipo de caracter con el que pintaremos la figura
	char caracter;
	
	// creamos un constructor con parámetros para los lados y el tipo de caracter
	public Figuras(int lado, char caracter) {
		// igualamos el valor de los atributos de la clase al de los parámetros de la función 
		this.lado = lado;
		this.caracter = caracter;
	}
	
	//creamos una función que imprimirá el triñángulo equilatero
	void triangulo() {
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado-i; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(caracter + " ");
				
			}
			System.out.println();
		}//fin for 1
	}//fin triangulo
	
	void cuadrado() {
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				System.out.print(caracter);			
			}
			System.out.println();
		}
	}
	
}
