/*Elabore um algoritmo a ler 4 notas de um aluno (de 1 a 10).
 *  Após calcular a média das notas, apresentar a mensagem 
 *  “Aprovada” se o aluno tiver obtido média maior ou igual a 6, 
 *  caso contrário, apresentar “Reprovado”.*/
package ifelse;

import java.util.Scanner;

public class IfElse15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notas[] = new double[4];
		

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
			System.out.println("Aprovado(a)");
		} else {
			System.out.println("Reprovado(a)");
		}

	}

}
