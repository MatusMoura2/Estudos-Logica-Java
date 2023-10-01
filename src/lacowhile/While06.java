/*Escreva um programa Java, para imprimir todas as letras
 *  do alfabeto de Z á A, ou seja, na ordem Reversa.*/

package lacowhile;

public class While06 {

	public static void main(String[] args) {
		char letra = 'z';

		while (letra >= 'a') {
			System.out.print(letra+" ");
		    letra--;
		}

	}

}
