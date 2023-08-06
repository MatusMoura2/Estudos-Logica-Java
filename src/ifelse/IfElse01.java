//Escreva um programa Java para obter um número do usuário e imprimir se é positivo ou negativo.

package ifelse;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		//Objeto construido a partir da classe Scanner para obter variaveis a partir do teclado do usuario.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		//instruções if else para determinar se o numero é positivo ou negativo, se o digito é 0 ou até mesmo se é um digito numerico inteiro
		if(num < 0) {
			System.out.println("Número negativo");
		}else if(num > 0){
			System.out.println("Número positivo");
		}else if(num == 0) {
			System.out.println("Número 0");
		}else {
			System.out.println("Isso não é um numero");
		}
		

	}

}
