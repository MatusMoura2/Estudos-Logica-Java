/*Escreva um programa Java, para somar todos os dígitos*/
package lacowhile;

import java.util.Scanner;

public class While16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont;
		int resultado = 0;
		int digitos;

		System.out.println("Quantos digitos você ira digitar?");
		cont = sc.nextInt();
		
		int i =0;
		while (cont > 0) {
			System.out.print("digite o "+(i+1)+"° numero: ");
			i++;
			digitos =sc.nextInt();
			resultado+=digitos;
			
			cont--;
		}
		
		System.out.println("A solma de todos os digitos é "+ resultado);

	}

}
