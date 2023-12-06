package funcionesatributos.ejercicio01;

public class Operaciones {
	double num1, num2;
	
	//creamos un constructor con los parámetros del numero 1 y 2
	public Operaciones(double num1, double num2) {
		//igualamos las variables de la clase con los parámetros del constructor
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//creamos un constructor sin parámetros
	public Operaciones() {
		
	}


	//creamos las funciones para las distintas operaciones

	double suma(){
		return num1+num2;		
	}
	
	double resta() {
		return num1-num2;		
	}
	
	double multiplicacion() {
		return num1*num2;		
	}
	
	double division() {
		return num1/num2;		
	}
	
	double max() {
		return (num1>num2)?num1:num2;		
	}
	
	double min() {
		return (num1<num2)?num1:num2;		
	}
}
