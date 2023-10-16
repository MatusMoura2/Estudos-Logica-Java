/*Altere o algoritmo anterior para que seja lido do teclado, 
 * além das notas, o sexo do aluno (M ou F). Se for masculino,
 *  o resultado deverá ser precedido de “Caro aluno, seu resultado é: “. 
 *  Se for feminino, o resultado deverá ser precedido de “Cara aluna, seu resultado é: “.
 */
package ifelse;

import java.util.Scanner;

public class IfElse16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notas[] = new double[4];

		System.out.print("Qual o seu sexo, digite M para masculino e F para feminino: ");
		char sex = sc.next().charAt(0);

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "° nota: ");
			notas[i] = sc.nextDouble();

			if (notas[i] > 10 || notas[i] < 0) {
				System.out.println("Nota invalida reinicie o programa!");
				break;
			}

		}
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
		if (media >= 6) {
			if (Character.toUpperCase(sex) == 'M') {
				System.out.println("Caro aluno, seu resultado é: aprovado");
			} else if (Character.toUpperCase(sex) == 'F') {
				System.out.println("Cara aluna, seu resultado é: aprovada");
			}
		} else {
			if (Character.toUpperCase(sex) == 'M') {
				System.out.println("Caro aluno, seu resultado é: reprovado");
			} else if (Character.toUpperCase(sex) == 'F') {
				System.out.println("Cara aluna, seu resultado é: reprovada");
			}
		}

	}

}