package lista3;

import javax.swing.JOptionPane;

public class Ex4 {

	//receba uma medida em pés e converta para jardas, polegadas e milhas, sabendo que
	//1 pé = 12 polegadas ; 1 jarda = 3 pés ; 1 milha = 1760 jardas;
	public static void main(String[] args) {
		double pe,pol,jard,milh;
		pe = Double.parseDouble(JOptionPane.showInputDialog("Insira uma medida em pés"));
		
		pol = pe*12;
		jard = pe/3;
		milh = jard/1760;
		
		JOptionPane.showMessageDialog(null, String.format("pés: %.2f%n"
				+ "polegadas: %.2f%njardas: %.2f%nmilhas: %.2f", pe, pol, jard, milh));

	}

}
