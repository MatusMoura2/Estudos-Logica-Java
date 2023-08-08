package operadorternario;

import java.util.Scanner;

public class OperadorTernario01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do roduto?");
		double precoProduto = sc.nextDouble();
		System.out.print("Qual a sua idade?");
		int idadeCliente = sc.nextInt();

		String valorFinal = idadeCliente > 60
				? "O valor do produto é " + (precoProduto - (precoProduto * 0.1)) + "R$ com desconto de 10%"
				: "O valor do produto é " + precoProduto + "Você paga valor intrgral";

		System.out.println(valorFinal);
	}

}
