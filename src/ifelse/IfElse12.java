/*Escrever um algoritmo que leia 
 * dois valores inteiros distintos e informe qual é o maior
 */

package ifelse;

import java.util.Scanner;

public class IfElse12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Esse programa informa qual numero é o maior!");

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo numero: ");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Os números são iguais!");

		} else if (num1 > num2) {
			System.out.printf("%d é maior que %d.", num1, num2);

		} else if (num1 < num2) {
			System.out.printf("%d é menor que %d.", num1, num2);
			
		}else {
			System.out.println("Digite numeros inteiros!");
		}
	}

}
