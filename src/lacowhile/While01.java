/*Escreva um programa Java, para imprimir todos os números naturais de 1 a N.*/

package lacowhile;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 1;
		System.out.println("Até quanto você quer contar: ");
		int contador = sc.nextInt();

		while (num1 <= contador) {
			System.out.print(num1 + " ");
			num1++;

		}

	}

}
