package lista3;

import javax.swing.JOptionPane;

public class Ex5 {

	//receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre a idade e quantos anos ela terá em 2050
	public static void main(String[] args) {

		int nasc,atual;
		
		nasc= Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));
		atual= Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
		
		JOptionPane.showMessageDialog(null, "Sua idade é "+(atual-nasc)+" anos\nVocê terá "+(2050-nasc)+" anos em 2050.");
	}

}
