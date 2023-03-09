package lista1;

import javax.swing.JOptionPane;

public class Exerc19 {

	public static void main(String[] args) {
		/*Crie um algoritmo que leia o tempo de duração de um evento expressa em segundos
		e mostre-o em horas, minutos e milissegundos
		*/
		
		double tempoDeDuracao,emHoras,emMin,emMili, emSeg;
		tempoDeDuracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a duração em segundos."));
		emMin = (tempoDeDuracao / 60) % 60;
		emSeg = tempoDeDuracao % 60;
		emHoras = tempoDeDuracao / 3600;
		emMili = (emSeg*1000)%1000 ;
		JOptionPane.showMessageDialog(null, String.format("O evento durou %.0f:%.0f:%.0f:%.0f", emHoras, emMin, emSeg,emMili));
	}

}
