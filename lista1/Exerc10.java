package lista1;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba os valores de a, b e c e calcule a equação de segundo
		grau formada por ax^2 + bx + c = 0.*/
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,delta,result1,result2;
		
		System.out.println("Insira, respectivamente, o valor de a, b e c:");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		delta = Math.pow(-b, 2) - 4 * a * c;
		
		if(delta < 0) {			
			System.out.println("raiz irracional");
			System.exit(0);
		}
		result1 = (-b + Math.sqrt(delta))/(2*a);
		result2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.printf("O valor de X1 = %f %nO valor de X2 = %f%n",result1,result2);
		
		ler.close();
	}

}
