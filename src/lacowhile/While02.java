/*Escreva um programa Java, 
 * para imprimir todos os números naturais na ordem reversa.*/
package lacowhile;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;

		int contador;

		System.out.print("Qual numero você quer iniciar a contagem na ordem decresente: ");

		contador = sc.nextInt();

		while (contador >= num1) {
			System.out.print(contador + " ");
			contador--;

		}

	}

}
