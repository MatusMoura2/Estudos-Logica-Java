/*. Escreva um programa Java para resolver equações quadráticas (use if, else if e else). Ir para o editor
Dados de teste
Entrada a: 1
Entrada b: 5
Entrada c: 1
Saída Esperada:
As raízes são -0,20871215252208009 e -4,7912878474779195
*/
package ifelse;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;

		double delta;

		System.out.print("Entre com o valor de a: ");
		a = sc.nextDouble();

		System.out.print("Entre com o valor de b: ");
		b = sc.nextDouble();

		System.out.print("Entre com o valor de c: ");
		c = sc.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raízes são " + x1 + " e " + x2);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("A raiz dupla é " + x);
		} else {
			System.out.println("A equação não possui raízes reais.");
		}

	}

}
