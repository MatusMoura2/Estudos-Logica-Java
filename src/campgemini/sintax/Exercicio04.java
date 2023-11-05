/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;*/

package campgemini.sintax;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		double salarioFixio, vendas;

		System.out.println("Qual o nome do vendedor? ");
		nome = sc.nextLine();

		System.out.println("Qual o seu saario fixo? ");
		salarioFixio = sc.nextDouble();

		System.out.println("Qunto " + nome + " vendeu? ");
		vendas = sc.nextDouble();

		System.out.println("olá " + nome + " o seu salario fixo é de " + salarioFixio
				+ "porem com a sua comissão o seu salario no final do mês será de " + (salarioFixio + (vendas * 0.15)));

		sc.close();
	}

}
