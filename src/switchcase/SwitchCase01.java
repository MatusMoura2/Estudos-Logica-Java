
//Escreva um programa em Java para ler um número de dia da semana e imprimir o nome do dia da semana usando a instrução switch

package switchcase;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaSemana;
		String dia;

		System.out.print("Digite um numero de um a 7 para obter um dia da semana: ");
		diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Esse numero não representa um dia da semana";break;
		}
		
		System.out.printf("numero %d representa: %s.",diaSemana,dia);
	}

}
