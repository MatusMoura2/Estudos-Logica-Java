/*Escreva um programa Java, para imprimir o valor ASCII.*/
package lacowhile;

import java.util.Scanner;

public class Whille12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ascii;
		char digito;
		int asciiInt;

		System.out.print("Digite caracteres: ");
		
		ascii = sc.nextLine();
		
		int i =0;
		while(i<ascii.length()) {
			digito= ascii.charAt(i);
			asciiInt = (int) digito;
			System.out.printf("O valor ASCII de %c é %d \n", digito, asciiInt);
			i++;
		}
		sc.close();
		
	}

}
