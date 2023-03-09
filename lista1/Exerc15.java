package lista1;

import javax.swing.JOptionPane;

public class Exerc15 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
		calcule e mostre:
		a) A idade dessa pessoa;
		b) Quantos dias de vida aproximadamente essa pessoa terá vivido em 2050.*/
		int anoNasc, anoAtual=2023,idade;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu"));
		idade = anoAtual - anoNasc;
		JOptionPane.showMessageDialog(null, "Sua idade eh "+idade+"\nE voce tera " +
		(2050 - anoNasc) + " anos em 2050");
		
	}

}
