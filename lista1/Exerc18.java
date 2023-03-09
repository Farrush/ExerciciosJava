package lista1;

import javax.swing.JOptionPane;

public class Exerc18 {

	public static void main(String[] args) {
		/* João recebeu seu salário e precisa pagar duas contas atrasadas. Por causa do
		atraso, ele deverá pagar multa de 2% sobre uma conta e 3,5% sobre a outra. Crie
		um algoritmo que calcule e mostre quanto restará do salário de João após pagar as
		2 contas.*/
		double salarioJoao = 3000,multa1,multa2,contaJoao;
		multa1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira multa"));
		multa2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda multa"));
		multa1 += multa1 * 0.02;
		multa2 += multa2 * 0.035;
		contaJoao = salarioJoao - multa1 - multa2;
		JOptionPane.showMessageDialog(null,String.format("O salário de João é %.2f%nMulta atrasada de %.2f%n"
				+ "Multa atrasada de %.2f%nSobrará %.2f do salário.", salarioJoao, multa1, multa2, contaJoao));
		
	}

}
