/*Faça um algoritmo que receba dois números e exiba o resultado da sua soma;*/

package campgemini.sintax;

import java.util.Scanner;

public class Exercicio01 {

	static int soma(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		int resultado;

		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextInt();

		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextInt();

		resultado = soma(num1, num2);

		System.out.println();
		System.out.print("O resultado da soma entre " + num1 + " e " + num2 + " é " + resultado);

	}

}
