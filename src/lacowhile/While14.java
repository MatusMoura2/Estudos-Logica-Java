/*Escreva um programa Java, para encontrar o valor de um número elevado à potência de outro.*/

package lacowhile;

import java.util.Scanner;

public class While14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int potencia;
		long resultado = 1l;

		System.out.print("Escolha um numero para ser elevado a uma potência: ");
		num = sc.nextInt();

		System.out.print("Escolha a potência: ");
		potencia = sc.nextInt();

		int i = 0;
		while (i < potencia) {
			resultado *= num;
			i++;

		}

		System.out.println(num + " elevado a " + potencia + "° potência é " + resultado + ".");
		sc.close();
	}

}
