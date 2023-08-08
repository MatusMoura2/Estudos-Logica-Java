/*Implemente um programa que recebe o valor total de uma compra e a
 *  idade do cliente. Utilize o operador ternário para aplicar um desconto de 10% 
 *  se o cliente tiver 60 anos ou mais, e exiba o valor final a ser pago.
 */
package operadorternario;

import java.util.Scanner;

public class OperadorTernario01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do roduto?");
		double precoProduto = sc.nextDouble();
		System.out.print("Qual a sua idade?");
		int idadeCliente = sc.nextInt();

		String valorFinal = idadeCliente >= 60
				? "O valor do produto é " + (precoProduto - (precoProduto * 0.1)) + "R$ com desconto de 10%"
				: "O valor do produto é " + precoProduto + " Você paga valor intrgral";

		System.out.println(valorFinal);
	}

}
