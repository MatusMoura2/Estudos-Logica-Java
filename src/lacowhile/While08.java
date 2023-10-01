/*Escreva um programa Java, para imprimir todos os números impares entre 1 a 100*/
package lacowhile;

public class While08 {

	public static void main(String[] args) {
		
		int num = 1;

		while (num <= 100) {
			if (num % 2 == 1) {
				System.out.print(num + " ");
			}
			num++;
		}
	}

}
