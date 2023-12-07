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
		// hacemos un bucle for que hará el valor de lado en saltos de línea
		for (int i = 1; i <= lado; i++) {
			// bucle que imprime el número de espacios antes de dibujar el primer caracter
			for (int j = 1; j <= lado-i; j++) {
				System.out.print(" ");
				
			}
			// bucle que dibuja los caracteres
			for (int j = 1; j <= i; j++) {
				System.out.print(caracter + " ");
				
			}
			// salto de línea
			System.out.println();
		}//fin for 1
	}//fin triangulo
	
	// creamos una función que dibujará el cuadrado
	void cuadrado() {
		// hacemos un bucle for que hará el valor de lado en saltos de línea 
		for (int i = 1; i <= lado; i++) {
			// bucle que dibuja los mismos caracteres que el valro de lado
			for (int j = 1; j <= lado; j++) {
				// dibuja un caracter
				System.out.print(caracter);			
			}
			// salto de linea
			System.out.println();
		}
	}
	
	void hexagono() {
		for (int i = 0; i <= lado-1; i++) {
			
			for (int j = 2; j <= lado-i; j++) {
				System.out.print(" ");			
			}
			for (int j = 1; j <= lado+(i*2); j++) {
				System.out.print(caracter);			
			}
			System.out.println();
			}//fin for 1
		
		for (int i = 0; i <	lado-1; i++) {
			for (int j = lado; j >= lado-i; j--) {
				System.out.print(" ");		
			}
			for (int j = 1; j <= lado+((lado-2)*2)-(i*2); j++) {
				System.out.print(caracter);			
			}
			System.out.println();
		}
		
		}//fin hexagono()
	}

