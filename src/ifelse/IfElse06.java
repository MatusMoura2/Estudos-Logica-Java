/* Escreva um programa Java que leia dois números de 
 * ponto flutuante e teste se eles são iguais até três casas decimais*/
package ifelse;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfElse06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");

		double num1;
		double num2;

		System.out.print("Digite um numero decimal:");
		num1 = sc.nextDouble();
		System.out.print("Digite outro numero decimal:");
		num2 = sc.nextDouble();

		String numF1 = df.format(num1);
		String numF2 = df.format(num2);

		if (numF1.equals(numF2)) {
			System.out.println("Ambos são iguais até a terceira casa decimal!");
		} else {
			System.out.println("Não são iguais até a terceira casa decimal!");
		}
	}
}
