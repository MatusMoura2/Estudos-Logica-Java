/*Escreva um programa Java, para imprimir todas Tabuadas de 3 números de entrada. 
1° Número inicial, 2° Número final, 3° N° Tabela a ser calculado na Ordem Reversa.*/

package lacowhile;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int resultado1;
		int resultado2;
		int resultado3;

		System.out.println("Quais numeros você quer a tabuada na ordrm reversa?");
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextInt();

		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextInt();

		System.out.print("Digite o terceiro numero: ");
		num3 = sc.nextInt();

		System.out.println();
		int i = 10;
		while (i >= 1) {
			resultado1 = num1 * i;

			System.out.println(num1 + " x " + i + " = " + resultado1);
			i--;

		}

		System.out.println();
		i = 10;
		while (i >= 1) {
			resultado2 = num2 * i;

			System.out.println(num2 + " x " + i + " = " + resultado2);

			i--;

		}

		System.out.println();
		i = 10;
		while (i >= 1) {
			resultado3 = num3 * i;

			System.out.println(num3 + " x " + i + " = " + resultado3);

			i--;

		}
		sc.close();
	}


}
