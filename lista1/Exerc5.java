package lista1;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba o valor de um depósito e o valor da taxa de juros,
calcule e mostre o valor do rendimento e o valor total após o rendimento.*/
		double deposito,juros,rendimento,total;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o valor do depósito:\n");
		deposito = leitor.nextDouble();
		System.out.print("Insira o valor da taxa de juros(em % apenas números):\n");
		// taxa de juros 1% = 0.01
		juros = leitor.nextDouble() / 100;
		

		
		String[] meses = {"Janeiro", "Fevereiro", "Marco","Abril","Maio","Junho"};
		
		for(int i = 0; i <= 5; i++) {
			rendimento = deposito * juros;
			total = deposito + rendimento;
			deposito = total;
			System.out.printf("%s%nRendimento: %.2f%nTotal: %.2f%n",meses[i],rendimento,total);
			System.out.println("==================================================");
		}
		
		leitor.close();
	}

}
