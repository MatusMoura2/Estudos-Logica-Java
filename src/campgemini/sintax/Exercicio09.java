/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m;
*/
package campgemini.sintax;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double deposito ;
		double juros;

		System.out.println("Qual o valor do deposito?");

		deposito = sc.nextDouble();
		juros = deposito * 0.0007;
		System.out.printf("O rendimento de %.2fR$ é de %.2fR$  ao mês.",deposito,juros);

	}

}
