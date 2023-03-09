package lista1;

import javax.swing.JOptionPane;

public class Exerc4 {

	public static void main(String[] args) {
		/*Crie um algoritmo que receba o salário bruto de um funcionário e exiba o seu salário
líquido, sabendo que ele tem 10% de gratificação sobre o salário base e tem 15%
de descontos sobre o salário após a gratificação.*/
		double salarioBruto;
		double gratificacao = 1.1;
		double desconto = 0.85;
		double salarioLiq;
		
		salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
		salarioLiq = (salarioBruto * gratificacao) * desconto;
		
		JOptionPane.showMessageDialog(null, String.format("O salário líquido é %.2f",salarioLiq));
		
		System.exit(0);
	}

}
