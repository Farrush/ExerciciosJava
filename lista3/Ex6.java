package lista3;

import javax.swing.JOptionPane;

public class Ex6 {
	//custo de um carro novo = preço de fabrica + percentual de lucro do vendedor + impostos sobre o preço de fabrica
	// receba o preço de fábrica, percentual de lucro e imposto e mostre o valor do lucro, valor de imposto e o preço final
	public static void main(String[] args) {
		double precoFab, percLucro, percImposto, valLucro, valImposto, valFinal;
		
		precoFab = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de fábrica:"));
		percLucro = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de lucro do distribuidor:"))/100;
		percImposto = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de imposto cobrado pelo valor de fábrica:"))/100;
		
		valLucro = precoFab * percLucro;
		valImposto = precoFab * percImposto;
		
		valFinal = precoFab + valLucro + valImposto;
		
		JOptionPane.showMessageDialog(null, String.format("Valor de fábrica = %.2f%nLucro dos vendedores = %.2f%nImposto = %.2f%nValor final = %.2f", precoFab, valLucro, valImposto, valFinal));
		
	}

}
