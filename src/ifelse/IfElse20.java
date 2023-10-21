/* Dados três valores X, Y e Z, 
 * verificar se eles podem ser os comprimentos
 * dos lados de um triângulo e, se forem verificar se é um triângulo equilátero,
 * isósceles ou escalenos. Se eles não formarem um triângulo, escrever a mensagem. 
 * Considere as seguintes propriedades: •O comprimento de cada lado em um triângulo é
 * menor que a soma dos outros dois lados; •Equiláteros: tem os comprimentos dos três
 * lados iguais; •Isósceles: tem os comprimentos de dois lados iguais; •escaleno: 
 * tem os comprimentos dos três lados diferentes.
 */

package ifelse;

import java.util.Scanner;

public class IfElse20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int x, y, z, valor = 0;

		System.out.println("Digite tres valores");
		System.out.print("Valor X: ");
		x = sc.nextInt();

		System.out.print("Valor Y: ");
		y = sc.nextInt();

		System.out.print("Valor Z: ");
		z = sc.nextInt();

		if (x > maior) {
			maior = valor;
		} else if (y > maior) {
			maior = valor;

		} else if (z > maior) {
			maior = valor;
		}
		
		System.out.println(valor);

	}

}
