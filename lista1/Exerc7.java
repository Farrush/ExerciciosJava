package lista1;

import javax.swing.JOptionPane;

public class Exerc7 {

	public static void main(String[] args) {
		/* Crie um algoritmo que receba o raio de um círculo, calcule e mostre a sua área e o
seu perímetro */
		
		double raio,area,circ;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do círculo:"));
		
		area = Math.pow(raio, 2) * Math.PI;
		circ = 2*raio*Math.PI;
		
		JOptionPane.showMessageDialog(null, String.format("Área do círculo: %n%.2f%nPerímetro"+
		" do círculo:%n%.2f", area, circ));
	}

}
