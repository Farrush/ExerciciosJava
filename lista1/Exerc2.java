package lista1;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// Crie um algoritmo que receba três notas e seus respectivos pesos, calcule e mostre
		// a média ponderada entre elas.
		double n1,n2,n3,p1,p2,p3,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite as tres notas e depois seus pesos respectivamente:");
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		n3 = leia.nextDouble();
		p1 = leia.nextDouble();
		p2 = leia.nextDouble();
		p3 = leia.nextDouble();
		
		media = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
		
		System.out.printf("Media: %.1f",media);
		leia.close();
	}

}
