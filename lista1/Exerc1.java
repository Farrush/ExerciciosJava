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
			a) ππΈπππΏπ1 = π΄ β π΅ β πΆ + π·
			b) ππΈπππΏπ2 = π΄ β (π΅ β πΆ
			c) ππΈπππΏπ3 = π΄ β πΆ β πΆ + π΄
			d) ππΈπππΏπ4 = π· β (π΅ / 2)
			e) ππΈπππΏπ5 = π΅ β π· β π΄ β πΆ
			f) ππΈπππΏπ6 = (π΄ + π΅ + πΆ) β οΏ½
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
