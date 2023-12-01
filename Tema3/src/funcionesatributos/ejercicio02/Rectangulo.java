package funcionesatributos.ejercicio02;

public class Rectangulo {
	double alto, ancho;
	
	public Rectangulo(double alto, double ancho) {
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
