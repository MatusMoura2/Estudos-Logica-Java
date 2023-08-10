/* Escreva um programa Java que mantenha um número do 
 * usuário e gere um inteiro entre 1 e 7 e exiba o nome do dia da semana*/
package ifelse;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numDia;

		System.out.println("Digite um número que represente um dia da semana: ");

		numDia = sc.nextInt();

		if (numDia == 1) {
			System.out.println("Domingo");
		} else if (numDia == 2) {
			System.out.println("Segunda-feira");
		} else if (numDia == 3) {
			System.out.println("Terça-feira");
		} else if (numDia == 4) {
			System.out.println("Quarta-feira");
		} else if (numDia == 5) {
			System.out.println("Quinta-feira");
		} else if (numDia == 6) {
			System.out.println("Sexta-feira");
		} else if (numDia == 7) {
			System.out.println("Sabado");
		} else{
			System.out.println("Esse numero não representa um dia da semana!");
		}

	}

}
