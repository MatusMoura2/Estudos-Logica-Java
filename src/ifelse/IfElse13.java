/*Elabore um algoritmo que leia do teclado o sexo de uma pessoa. 
 * Se o sexo digitado for M ou F, escrever na tela “Sexo válido!”.
 *  Caso contrário, informar “Sexo inválido
 */
package ifelse;

import java.util.Scanner;

public class IfElse13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Didite um caractere correspondente a um sexo: ");
		char sexo = sc.next().charAt(0);

		if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
			System.out.println("Sexo valido!");
			
		}else {
			System.out.println("Sexo invalido!");
		}
		sc.close();
	}

}
