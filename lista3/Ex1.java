package lista3;

import javax.swing.JOptionPane;
import java.lang.Math;
public class Ex1 {
	//Calcule e mostre a área de um círculo
	public static void main(String[] args) {
		double raio,area;
		
		double pi = Math.acos(-1.0);
		double deg90 = Math.asin(1.0);
		double deg270 = Math.asin(-1.0);
		
		System.out.println(pi+" 90: "+deg90+" 270: "+deg270);
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo:"));
		area = Math.pow(raio, 2)*Math.PI;
		
		JOptionPane.showMessageDialog(null, String.format("A área do círculo é %.2f", area));
	}
}
