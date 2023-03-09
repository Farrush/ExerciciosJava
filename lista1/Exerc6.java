package lista1;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba como entrada a base e a altura de um triângulo,
calcule e mostre a sua área.
*/
		
		double base,altura,area;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Insira a base do triangulo:");
		base = leitor.nextDouble();
		
		System.out.println("Insira a altura do triangulo:");
		altura = leitor.nextDouble();
		
		area = (base*altura)/2;
		System.out.println("Area do triangulo: "+area);
		
		leitor.close();
	}

}
