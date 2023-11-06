/*Escreva um programa Java, para inserir os números até o 
 * usuário desejar e ao final devera exibir a contagem de 
 * positivos, negativos e zeros inseridos.
 */
package lacowhile;

import java.util.Scanner;

public class While19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cont, pos = 0, neg = 0, zer = 0, num;

		System.out.print("Quantos numeros você quer digitar: ");
		cont = sc.nextInt();

		int i = 1;
		while (cont > 0) {
			System.out.print("Digite o " + i + "° numero: ");
			num = sc.nextInt();
			i++;
			if (num > 0) {
				pos++;
			} else if (num < 0) {
				neg++;
			} else {
				zer++;
			}
			cont--;

		}
		System.out.print("A quantidade de numeros positivos é de: " + pos);
		System.out.println();

		System.out.print("A quantidade de numeros negativos é de: " + neg);
		System.out.println();

		System.out.print("A quantidade de zeros é de: " + zer);

	}

}
