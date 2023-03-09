package lista3;

import javax.swing.JOptionPane;

public class Ex7 {
	//Receba o número de horas trabalhadas e o valor do salário mínimo e mostre o salário a receber de acordo com
	//a hora trabalhada vale metade do salário mínimo
	//o salario bruto equivale ao numero de horas trabalhadas multiplicado pelo valor de hora trabalhada
	//o imposto equivale a 3% do salário bruto
	//o salario a receber equivale ao salario bruto menos o imposto
	public static void main(String[] args) {
		double horasTrab, valHora, salMin, salBruto, salLiq;
		horasTrab = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		salMin = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo"));

		valHora = salMin/2;
		salBruto = horasTrab * valHora;
		salLiq = salBruto - (salBruto *0.03);
		
		JOptionPane.showMessageDialog(null, String.format("O salário a receber é R$ %.2f",salLiq));
	}

}
