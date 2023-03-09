package lista1;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		//  Crie um algoritmo que receba um número e mostre na tela a sua tabuada.
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número que quer a tabuada:");
		int numero = leia.nextInt();
		
		for(int i = 1; i <= 10;i++) {
			System.out.printf("%d * %d = %d%n",numero,i,numero*i);
		}
		leia.close();
	}

}
