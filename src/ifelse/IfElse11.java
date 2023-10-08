/*Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno 
 * durante o semestre. Calcular a sua média (aritmética), informar o nome e 
 * sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação 
 * (media entre 5.1 a 6.9).
 */
package ifelse;

import java.util.Scanner;

public class IfElse11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;

		double nota01;
		double nota02;
		double nota03;

		double media;

		System.out.print("Escreva o seu nome: ");
		nome = sc.nextLine();

		System.out.println("Qual a sua primeira nota?");
		nota01 = sc.nextDouble();

		System.out.println("Qual a sua segunda nota?");
		nota02 = sc.nextDouble();

		System.out.println("Qual a sua terceira nota?");
		nota03 = sc.nextDouble();

		media = (nota01 + nota02 + nota03) / 3;

		if (media <= 5) {
			System.out.printf("%s você foi reprovado!", nome);

		} else if (media > 5 && media < 6) {
			System.out.printf("%s você ficou de recuperação!", nome);

		} else if (media >= 7) {
			System.out.printf("%s você foi aprovado(a)", nome);
		}else {
			System.out.println(" isso não é uma media valida!");
		}
		sc.close();
	}

}
