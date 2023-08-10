/* Escreva um programa Java que leia um número de ponto flutuante e imprima "zero" se o número for zero. 
 * Caso contrário, imprima "positivo" ou "negativo". Adicione "pequeno" 
 * se o valor absoluto do número for menor que 1 ou "grande" se exceder 1.000.000*/
package ifelse;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		
		float num = sc.nextFloat();

		if(num < 0 && num<1) {
			System.out.println(num+" é negativo e pequeno!");
		}else if(num>0&& num>1000000) {
			System.out.println(num+" é positivo e grande!");
		}else if(num == 0) {
			System.out.println("você digitou 0 numero pequeno");
		}else if(num>0) {
			System.out.println(num+" é positivo!");
		}else {
			System.out.println("Digite apenas um numero de ponto flutuante!");
		}
	}

}
