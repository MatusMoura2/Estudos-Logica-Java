/*Escreva um programa Java, para reverter
os dígitos fornecidos como entrada.*/
package lacowhile;

import java.util.Scanner;

public class While15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String digitos;
		String resultado = "";
		char digitos2;

		System.out.print("Digite digitos para serem revertidos: ");
		digitos = sc.nextLine();

		int i = digitos.length() - 1;
		while (i >= 0) {
			digitos2 = digitos.charAt(i);
			resultado += digitos2;
			i--;
		}
		
		System.out.printf("%s ao contrario é %s.",digitos,resultado);
		sc.close();
	}

}
