package lista1;

import javax.swing.JOptionPane;

public class Exerc20 {

	public static void main(String[] args) {
		/* Crie um algoritmo que leia um valor em dias e exiba em horas, meses, trimestres,
		semestres, anos e décadas.*/
		// 4261 dias equivale a um de cada (e 24 horas).
		int dias,horas,meses,trimestres,semestres,anos,decadas;
		dias = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de dias"));
		horas = (dias%30)*24;
		meses = (dias/3600) % 30;
		trimestres = (dias/3600) % 90;
		semestres = (dias/3600) % 180;
		anos = (dias/3600) % 360;
		decadas = (dias/3600) % 3600;
		
		JOptionPane.showMessageDialog(null, String.format("%d décadas%n%d anos%n%d semestres%n%d trimestres%n"
				+ "%d meses%n%d horas", decadas, anos, semestres, trimestres, meses, horas));
	}

}
