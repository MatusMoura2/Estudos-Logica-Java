/*Escreva um programa Java, para verificar se um número é um número forte ou não
 */
package lacowhile;

import java.util.Scanner;

public class While23 {

	static int fatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}

	// Função para verificar se um número é forte
	static boolean ehNumeroForte(int numero) {
		int original = numero;
		int somaFatoriais = 0;

		while (numero > 0) {
			int digito = numero % 10;
			somaFatoriais += fatorial(digito);
			numero /= 10;
		}

		return somaFatoriais == original;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero para sabermos se é forte ou não:");

		int numero = sc.nextInt();

		if (ehNumeroForte(numero)) {
			System.out.println(numero + " é um número forte.");
		} else {
			System.out.println(numero + " não é um número forte.");
		}

		sc.close();
	}

}
