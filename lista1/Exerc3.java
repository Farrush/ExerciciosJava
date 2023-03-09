package lista1;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba o nome e o salário de um funcionário, calcule seu
		novo salário sabendo que ele recebeu um aumento de 25% e mostre uma frase com
		o nome, o valor do aumento e o novo salário. */
		Scanner leia = new Scanner(System.in);
		String nome;
		double salario;
		
		System.out.println("Digite o nome do funcionário:");
		nome = leia.nextLine();
		System.out.println("Digite o salário dele:");
		salario = leia.nextDouble();
		double aumento = salario * 0.25;
		
		System.out.printf("Parabéns, %s, você recebeu um aumento de %.2f.%n Seu novo salário é %.2f",
				nome,aumento,salario+aumento);
		
		leia.close();
	}

}
