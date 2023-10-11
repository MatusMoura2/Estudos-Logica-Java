/*Elabore um algoritmo que leia dois números inteiros 
 * e mostre o resultado da diferença do maior valor pelo menor
 */

package ifelse;

import java.util.Scanner;

public class IfElse14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite outo número: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("A diferença entre " + num1 + " e " + num2 + " é " + (num1 - num2));

		} else if (num2 > num1) {
			System.out.println("A diferença entre " + num2 + " e " + num1 + " é " + (num2 - num1));

		} else if (num1 == num2) {
			System.out.println("Não há diferença entre " + num1 + " e " + num2);
			
		}else {
			System.out.println("Por favor digite só números inteiros!");
		}
	}

}
