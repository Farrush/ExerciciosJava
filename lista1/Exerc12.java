package lista1;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		/*Cada degrau de uma escada tem X de altura. Crie um algoritmo que receba essa
altura e a altura que o usuário deseja alcançar subindo a escada e mostre quantos
degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura
do usuário. Todas as medidas fornecidas devem estar em metros.*/
		Scanner ler = new Scanner(System.in);
		double alturaDegrau, alturaDesejada ;
		int qtdeNecessaria;
		
		System.out.println("Qual a altura em metros de cada degrau?");
		alturaDegrau = ler.nextDouble();
		
		System.out.println("Qual a altura em metros que você deseja alcançar?");
		alturaDesejada = ler.nextDouble();
		
		qtdeNecessaria = (int) (alturaDesejada/alturaDegrau)+1;
		
		System.out.println("Você precisara subir "+qtdeNecessaria+" degraus.");

		ler.close();
	}

}
