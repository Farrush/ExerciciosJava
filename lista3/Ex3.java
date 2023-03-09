package lista3;

import javax.swing.JOptionPane;
import java.lang.Math;
public class Ex3 {
		
	//receba dois números maiores que zero, calcule e mostre um elevado ao outro
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número maior que zero:"));
		
		while(n1 == 0) {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número maior que zero,\nPOR FAVOR!!!"));
		}
		
		
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número maior que zero:"));
		
		while(n2 == 0) {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número maior que zero,\nPOR FAVOR!!!"));
		}
		
		
		if(n2 < 0) {
			n2 = n2*-1;
		}
		
		if(n1 < 0) {
			n1 = n1*-1;
		}
		
		
		double resultado;
		
		
		
		resultado = Math.pow(n1, n2);
		
		JOptionPane.showMessageDialog(null, String.format("%d elevado a %d é igual a %.0f", n1, n2, resultado));

	}

}
