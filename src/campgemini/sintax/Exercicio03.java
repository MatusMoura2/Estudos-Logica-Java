/*Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto;*/
package campgemini.sintax;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double kmRodado,litrosConsumidos;
		
		System.out.print("Quantos Kms você dirigiu: ");
		kmRodado =sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Quantos litros de combustivel foram consumidos: ");
		litrosConsumidos =sc.nextDouble();
		
		if(kmRodado < litrosConsumidos) {
			System.out.println("Dados fornecidos invalidos");
		}else {
			System.out.println("A medis de consumo do seu veiculo é de: "+(kmRodado/litrosConsumidos)+" por km!");
		}

	}

}
