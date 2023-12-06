package ampliacionfunciones.ejercicio02;

public class Esfera {
	//creamos un atributo para almacenar el radio de la esfera
	double radio;
	
	//creamos un constructor de la clase con un parámetro para el radio
	public Esfera(double radio) {
		//igualamos la variable radio a el valor del parámetro del constructor
		this.radio = radio;
	}
	
	
	//creamos una función para calcular la superfice de la esfera
	double superficie() {
		return 4*Math.PI*Math.pow(radio, 2);
	}
	
	//creamos una función para calcular el volumen de la esfera
	double volumen() {
		return ((4*Math.PI)/3)*Math.pow(radio, 3);
	}
	
}//fin clase

