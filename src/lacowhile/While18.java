/*Escreva um programa Java, para calcular HCF(Algoritmo Euclidiano) de dois números de entrada.*/
package lacowhile;

import java.util.Scanner;

public class While18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		int mdc = calcularMDC(num1, num2);

		System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + mdc);

		sc.close();
	}

	public static int calcularMDC(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
