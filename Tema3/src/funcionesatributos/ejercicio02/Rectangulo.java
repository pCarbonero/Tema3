package funcionesatributos.ejercicio02;

public class Rectangulo {
	double alto, ancho;
	
	//creamos un constructor con parámetros para almacenar el alto y el ancho
	public Rectangulo(double alto, double ancho) {
		//igualamos las variables alto y ancho de la clase con los parámetros alto y ancho del constructor
		this.alto = alto;
		this.ancho = ancho;
	}
	
	double perimetro() {
		return (alto * 2) + (ancho * 2);
	}
	
	double area() {
		return alto * ancho;
	}

}
