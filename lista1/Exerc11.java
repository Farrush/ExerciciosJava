package lista1;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		/* Sabe-se que o kilowatt de energia custa 1/5 de um determinado valor de referência.
		Crie um algoritmo que receba este valor de referência, a quantidade de kws
		consumida por uma residência, calcule e mostre:
		a) O valor de cada kw;
		b) O valor a ser pago por essa residência;
		c) O valor a ser pago considerando um bônus de 17%;
		d) O valor a ser pago com 10 dias de atraso, sabendo que cada dia de atraso
		acarreta um acréscimo de 0,5% sobre o valor original da conta.
		*/
		double valorRef,kwConsumido;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o valor de referência");
		valorRef = ler.nextDouble();
		System.out.println("Insira a quantidade de KiloWatts consumidos");
		kwConsumido = ler.nextDouble();

		System.out.println("O valor de cada kw: "+ (valorRef / 5) / kwConsumido);
		System.out.println("O valor a ser pago por essa residência: "+ valorRef / 5);
		System.out.println("O valor a ser pago + bônus de 17%: "+ (valorRef/5)*1.17);
		System.out.println("O valor atrasado 10 dias: "+ (valorRef*1.05/5));
		ler.close();
	}

}
