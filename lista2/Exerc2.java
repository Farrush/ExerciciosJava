package lista2;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		//leia 3 números e informe o menor
		int n1,n2,n3;
		int maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite três números:");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		
		if(n1 > n3 && n1 > n2) {
			maior = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		else if(n3 > n1 && n3 > n2) {
			maior = n3;
		}
		else {
			System.out.println("Números maiores iguais");
			System.exit(0);
		}
		System.out.println("O maior numero é "+maior);
	}

}
