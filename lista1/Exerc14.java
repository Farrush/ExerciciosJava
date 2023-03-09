package lista1;

import javax.swing.JOptionPane;

public class Exerc14 {

	public static void main(String[] args) {
		/* Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse
trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. Sabe-se que
cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta
está zerado.
*/
		double valorNaConta = 0;
		double valorCheque;
		valorNaConta += Double.parseDouble(JOptionPane.showInputDialog("Deposite seu salário:"));

		
		while(true) {
			if(JOptionPane.showConfirmDialog(null, "Deseja retirar um cheque?",null,
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				valorCheque = calculaCheque();
				if(valorNaConta - valorCheque > 0) {
					valorNaConta -= valorCheque;	
				}
				else {
					JOptionPane.showMessageDialog(null, "Cheque inválido");
				}
			}else {
				break;
			}
		}
		
		if(JOptionPane.showConfirmDialog(null, "Deseja ver seu saldo atual?",null,
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {			
			JOptionPane.showMessageDialog(null, String.format("Seu saldo atual é: %.2f",valorNaConta));
		}
	}
	public static double calculaCheque() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do novo cheque:"))*(1.0038);
	}

}
