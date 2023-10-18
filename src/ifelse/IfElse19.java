/*Faça um algoritmo que leia um número e mostre uma mensagem 
 * indicando se este número é par ou ímpar e se é positivo ou negativo.
 */
package ifelse;

import java.util.Scanner;

public class IfElse19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva um numero inteiro: ");
		int num = sc.nextInt();

		if (num < 0 && num % 2 == 0) {
			System.out.println(num + " é negativo e par");

		} else if (num > 0 && num % 2 == 0) {
			System.out.println(num + " é positivo e par");

		} else if (num > 0 && num % 2 == 1) {
			System.out.println(num + " é positivo e impar");

		}else{
			System.out.println(num + " é negativo e impar");
			
		}

	}
}


