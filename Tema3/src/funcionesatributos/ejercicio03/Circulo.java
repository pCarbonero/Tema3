package funcionesatributos.ejercicio03;

public class Circulo {
	//creamos la variable radio que la usaremos en las funciones
	double radio;
	
	//creamos un constructor con un parámetro en el que almacenamos el radio
	public Circulo(double radio) {
		//igualamos la variable radio de la clase con la variable radio del constructor
		this.radio = radio;
	}
	
	//funcion para calcular el perímetro
	double circunferencia() {
		return 2*Math.PI*radio;
	}
	
	//fuyncion para calcualr el área
	double area() {
		return Math.PI*Math.pow(radio, 2);
	}
}
