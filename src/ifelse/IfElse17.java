/*A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
Professor Nível 1 R$12,00 por hora/aula Professor Nível 2 R$17,00 por hora/aula Professor Nível
3 R$25,00 por hora/aula*/
package ifelse;

import java.util.Scanner;

public class IfElse17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double horaAula = 0;

		System.out.print("Qual o seu nivel Professor? 1 - 2 - 3: ");
		int nivel = sc.nextInt();

		System.out.print("Quantas horas você ensinou na escoloa Aprender esse mês? ");
		double horasLecionadas = sc.nextDouble();
		if (nivel == 1) {
			horaAula = 12;
			System.out.println("Você tem " + (horaAula * horasLecionadas) + "R$ a receber.");

		} else if (nivel == 2) {
			horaAula = 17;
			System.out.println("Você tem " + (horaAula * horasLecionadas) + "R$ a receber.");

		} else if (nivel == 3) {
			horaAula = 25;
			System.out.println("Você tem " + (horaAula * horasLecionadas) + "R$ a receber.");
		}

	}

}
