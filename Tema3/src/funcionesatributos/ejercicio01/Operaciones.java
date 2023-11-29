package funcionesatributos.ejercicio01;

public class Operaciones {
	double num1, num2;
	
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}



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
