import java.util.Scanner;

// Escreva um programa Java para encontrar o número de dias em um mês.
public class IfElse07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numMes;

		/**
		 * A palavra-chave var foi introduzida no Java 10 como parte das melhorias na
		 * inferência de tipos. Ela permite que o compilador infira automaticamente o
		 * tipo de uma variável com base no valor atribuído a ela.
		 */
		var mes31 = 31;
		var mes30 = 30;
		var fev = 28;
		var bisex = fev + 1;

		System.out.print("Digite um numero que represente um mês: ");

		numMes = sc.nextInt();

		if (numMes == 1) {
			System.out.println("Janeiro tem " + mes31 + " dias.");
		} else if (numMes == 2) {
			System.out.println("Fevereiro tem " + fev + " dias, se o ano for bisexto tem " + bisex + ".");
		} else if (numMes == 3) {
			System.out.println("Março tem " + mes31 + " dias.");
		} else if (numMes == 4) {
			System.out.println("Abril tem " + mes30 + " dias.");
		} else if (numMes == 5) {
			System.out.println("Maio tem " + mes31 + " dias.");
		} else if (numMes == 6) {
			System.out.println("Junho tem " + mes30 + " dias.");
		} else if (numMes == 7) {
			System.out.println("Julho tem " + mes31 + " dias.");
		} else if (numMes == 8) {
			System.out.println("Agosto tem " + mes31 + " dias.");
		} else if (numMes == 9) {
			System.out.println("Setembro tem " + mes30 + " dias.");
		} else if (numMes == 10) {
			System.out.println("Outubro tem " + mes31 + " dias.");
		} else if (numMes == 11) {
			System.out.println("Novembro tem " + mes30 + " dias.");
		} else if (numMes == 12) {
			System.out.println("Dezembro tem " + mes31 + " dias.");
		} else {
			System.out.println("Esse numero não representa um mes do ano!");
		}

	}

}
