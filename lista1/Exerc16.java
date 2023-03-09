package lista1;

import javax.swing.JOptionPane;

public class Exerc16 {

	public static void main(String[] args) {
		/* Sabe-se que 1 pé = 12 polegadas, 1 jarda = 3 pés, 1 milha = 1760 jardas. Crie
		um algoritmo que receba uma medida em pés, faça as conversões e mostre os
		resultados em:
		a) Polegadas;
		b) Jardas;
		c) Milhas. */
		double valorPe,valorPol,valorJar,valorMil;
		valorPe = Double.parseDouble(JOptionPane.showInputDialog(String.format("Digite o tamanho em pés")));
		valorPol = valorPe * 12;
		valorJar = valorPe / 3;
		valorMil = valorJar/1760;
		
		JOptionPane.showMessageDialog(null,String.format("Valor em pés: %.2f%nValor em polegadas: %.2f%nValor"
				+ " em jardas: %.2f%nValor em milhas: %f", valorPe,valorPol,valorJar,valorMil));
	}
}
