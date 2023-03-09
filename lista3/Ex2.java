package lista3;

import javax.swing.JOptionPane;

public class Ex2 {
		//receba um número positivo e mostre, ao quadrado, ao cubo, raiz quadrada e raiz cúbica
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número maior que zero:"));
		double pot2,pot3,raiz2,raiz3;

		if(n1 < 0) {
			n1 = n1*-1;
		}
		if(n1 == 0) {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número maior que zero,\nPOR FAVOR!!!"));
		}
		
		pot2 = Math.pow(n1, 2);
		pot3 = Math.pow(n1, 3);
		raiz2 = Math.sqrt(n1);
		raiz3 = Math.cbrt(n1);
		
		JOptionPane.showMessageDialog(null, String.format("Número escolhido: %d%nElevado a 2: %.0f%nElevado a 3: %.0f%nRaiz quadrada: %.2f%nRaiz cúbica: %.2f", n1, pot2, pot3, raiz2, raiz3));
	}

}
