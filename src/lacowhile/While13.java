/*Escreva um programa Java, para encontrar o fatorial de qualquer número.*/
package lacowhile;

import java.util.Scanner;

public class While13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int fatorial = 1;

		System.out.print("Digite um numero para calcularmos o fatorial: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("O numero precisa ser positivo");
			
		} else {
			int i = 1;
			while (i <= num) {
				fatorial = fatorial * i;
				i++;
			}
			System.out.printf("O fatorial de %d é %d.", num, fatorial);
		}
		sc.close();
	}

}
