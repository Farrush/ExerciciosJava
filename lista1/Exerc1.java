/*
 * 
 * Nome: Rafael Carrenho Taranto
 * Turma: ADS C
 * 
 * 
 * */
package lista1;
public class Exerc1 {

	public static void main(String[] args) {
		/* Sabendo que A = 5, B = 1, C = 3 e D = 8, crie um algoritmo que calcule os resultados
		e exiba-os na tela:
			a) 𝑅𝐸𝑆𝑈𝐿𝑇1 = 𝐴 ∗ 𝐵 – 𝐶 + 𝐷
			b) 𝑅𝐸𝑆𝑈𝐿𝑇2 = 𝐴 ∗ (𝐵 – 𝐶
			c) 𝑅𝐸𝑆𝑈𝐿𝑇3 = 𝐴 – 𝐶 ∗ 𝐶 + 𝐴
			d) 𝑅𝐸𝑆𝑈𝐿𝑇4 = 𝐷 ∗ (𝐵 / 2)
			e) 𝑅𝐸𝑆𝑈𝐿𝑇5 = 𝐵 ∗ 𝐷 ∗ 𝐴 – 𝐶
			f) 𝑅𝐸𝑆𝑈𝐿𝑇6 = (𝐴 + 𝐵 + 𝐶) ∗ �
			*/
		double a = 5;
		double b = 1;
		double c = 3;
		double d = 8;
		double result1,result2,result3,result4,result5,result6;
		
		result1 = a*b-c+d;
		result2 = a*(b-c);
		result3 = a-c*c+a;
		result4 = d*(b/2);
		result5 = b*d*a-c;
		result6 = (a+b+c)*d;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}

}
