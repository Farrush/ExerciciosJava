package lista1;

import javax.swing.JOptionPane;

public class Exerc17 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba os valores dos catetos de um triângulo, calcule e
		mostre o valor da hipotenusa.*/
		double ca,co,h;
		//h^2=ca^2+co^2      h= sqrt(pow(ca,2)+pow(co,2))
		ca = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do cateto adjacente"));
		co = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do cateto oposto"));
		h = Math.sqrt(Math.pow(ca,2)+Math.pow(co, 2));
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é "+ h);
	}

}
