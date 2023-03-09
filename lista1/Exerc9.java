package lista1;

public class Exerc9 {

	public static void main(String[] args) {
		/*Crie um algoritmo que resolva a seguinte equação X^2 − 5X + 6 = 0*/
		
		/*int x;
		
		for (int i = 0; i<=10; i++) {
			if((Math.pow(i, 2)-(5*i)+6) == 0) {
				x = i;
				System.out.println("O valor de X pode ser "+ x);
			}
		}*/
		double a,b,c,delta,result1,result2;
		
		delta = Math.pow(-(-5), 2) - 4 * 1 * 6;
		
		if(delta < 0) {			
			System.out.println("raiz irracional");
			System.exit(0);
		}
		result1 = (-(-5) + Math.sqrt(delta))/(2*1);
		result2 = (-(-5) - Math.sqrt(delta))/(2*1);
		System.out.printf("X1 = %.2f%nX2 = %.2f",result1,result2);
	}

}
