package sobrecargafunciones.ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a, b, c;
		int suma1, suma2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a");
		a = sc.nextInt();
		System.out.println("b");
		b = sc.nextInt();
		System.out.println("c");
		c = sc.nextInt();
		suma1=Sumas.sumaEnteros(a);
		suma2=Sumas.sumaEnteros(b,c);
		
		System.out.println("Suma 1 " + suma1);
		System.out.println("Suma 2 " + suma2);
		
		sc.close();
	}

}
