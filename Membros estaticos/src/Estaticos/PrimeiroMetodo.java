package Estaticos;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculo;

public class PrimeiroMetodo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculo cal = new Calculo();
		
		System.out.println("Insira um raio:");
		double radius = sc.nextDouble();
		
		double c = Calculo.circuferencia(radius);
		double v = Calculo.volume(radius);
		
		System.out.printf("Circuferencia: %.2f%n",c );
		System.out.printf("Volume: %.2f%n",v );
		System.out.printf("Valor de PI: %.2f%n",Calculo.PI );
		
	sc.close();
	}
}
