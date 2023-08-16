/**Em Java, um vetor (também conhecido como array) 
 * é uma estrutura de dados que permite armazenar um 
 * conjunto de elementos do mesmo tipo sob um único nome. 
 * Cada elemento em um vetor é acessado por um índice numérico,
 *  que começa em 0 para o primeiro elemento, 1 para o segundo elemento e assim por diante.
 *   Vetores são úteis quando você precisa armazenar e manipular coleções ordenadas de dados.*/
package vetorArray;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[20];
		int[] par;
		int[] impar;
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();

			if (numeros[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		par = new int[pares];
		impar = new int[impares];

		int numPares = 0;
		int numImpares = 0;

		for (int i = 0; i < 20; i++) {
			if (numeros[i] % 2 == 0) {
				par[numPares] = numeros[i];
				numPares++;
			} else {
				impar[numImpares] = numeros[i];
				numImpares++;
			}
		}

		System.out.println("Números pares:");
		for (int i = 0; i < pares; i++) {
			System.out.print(par[i] + " ");
		}
		System.out.println();

		System.out.println("Números ímpares:");
		for (int i = 0; i < impares; i++) {
			System.out.print(impar[i] + " ");
		}
	}
}
