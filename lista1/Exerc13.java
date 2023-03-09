package lista1;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		/* Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos, para os
quais fornece a quantidade de ração em gramas. A quantidade diária de ração
fornecida para cada gato é sempre a mesma. Crie um algoritmo que receba o peso
do saco de ração e a quantidade de ração fornecida para cada gato, calcule e mostre
quanto restará de ração no saco após cinco dias. */
		double qtdeRacao, qtdeDiariaGatos;
		int dias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o peso em quilos do pacote de ração:");
		qtdeRacao = ler.nextDouble();
		System.out.println("Insira a quantidade diária que cada gato recebe em gramas:");
		qtdeDiariaGatos = ler.nextDouble();
		dias = 5;
		
		System.out.println("Em "+ dias +" dias, vai sobrar: "+((qtdeRacao*1000)-((qtdeDiariaGatos*2)*dias))/1000+" Kg.");
		
		ler.close();
	}

}
