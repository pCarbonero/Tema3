package funcionesatributos.ejercicio04;

public class Cilindro {
	double radio, altura;
	
	//creamos un constructor sin parámetros
	public Cilindro() {
		
	}
	
	//creamos un constructor con parámetros para almacenar el radio y la altura del cilindro
	public Cilindro(double radio, double altura) {
		//igualamos las variables radio y cilindro de la clase con los parámetros radio y cilindro del constructor
		this.radio = radio;
		this.altura = altura;
	}
	
	//creamos la función que va a realizar el cálculo del volumen del cilindro
	double volumen() {
		return Math.PI*Math.pow(radio, 2)*altura;
	}
	
	//creamos la función que va a  realizar el cálculo del área del cilindro
	double area() {
		return 2 * radio * (altura + radio);
	}

}
