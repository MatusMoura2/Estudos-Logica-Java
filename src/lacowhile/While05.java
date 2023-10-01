/*Escreva um programa Java, para imprimir todas as letras do alfabeto de A à Z.*/
package lacowhile;

public class While05 {

	public static void main(String[] args) {
		char letra = 'a';

		while (letra <= 'z') {
			System.out.print(letra+" ");
		    letra++;
		}
	}

}
