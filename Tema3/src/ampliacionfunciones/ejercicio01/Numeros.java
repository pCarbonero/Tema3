package ampliacionfunciones.ejercicio01;

public class Numeros {
	// creamos un atributo para la clase número
	int numero;

	// creamos un constructor para la clase Numeros
	public Numeros(int numero) {
		// igualamos la variable numero de la clase al valor del parámetro del
		// constructor
		this.numero = numero;
	}

	// creamos una fucncion tipo boolean que nos devolverá si numero es primo o no
	boolean esPrimo() {
		boolean esP = true;
		
		// bucle for que comprobará si el número es primo en un rango de i entre 1 y numero
		for (int i = 2; i < numero; i++) {
			// comprobamos si el módulo de numero entre i es 0, en caso de serlo significa
			// que el numero no es primo
			if (numero % i == 0) {
				esP = false;
			}
		} // fin bucle
		
		// si el número solo es divisible entre 1 y el mismo es primo, excepto si es 1,
		// por lo que comprobamos is loes. En caso de serlo igualamos la booleana a
		// false	
		if (esP && numero == 1) {
			esP = false;
		}
		
		//devolvemos el valor de la booleana
		return esP;
	}
	
	
	// creamos una funcion que comprueba si el número es capicúa
	boolean esCapicua() {
		// boolean para almacenar si numero es capicua o no
		boolean esCapi = false;
		// variable aux para igualarlo a numero, de esta forma podemos manipular el valor de numero sin modificar la variable original
		int aux;
		//int inverso en el cual almacenaremos el valor de numero al reves
		int inverso = 0;
		// variable para almacenar cual es la ultima cifra de aux
		int ultimo;
		
		//igualamos aux a numero
		aux = numero;
		
		//bucle para crear el valro de numero al revés
		while(aux>=1) {
			//igualamos ultimo al modulo de aux entre 10, que  es la ultima cifra de aux
			ultimo = aux%10;
			//igualamos inverso a inverso*10 + la ultimna cifra de aux, asi poco a poco iremos formando el numero invertido
			inverso = inverso * 10 + ultimo;
			//dividimos aux/10 de forma que en la proxima iteración aux tendrá una cufra menos
			aux = aux/10;
		}
		
		//comprobamos que numero es igual a inverso
		if (inverso == numero) {
			// en caso de serlo hacemos la booleana true
			esCapi = true;
		}
		// devolvemos el valor de la booleana esCapi
		return esCapi;
	}
}
