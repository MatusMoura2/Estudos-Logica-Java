
/*Escreva um programa Java, para encontrar a 
 * soma de todos os números pares entre 1 e N.*/
package lacowhile;
import java.util.Scanner;

public class While10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		long soma = 0;
		int loop = 1;
		System.out.print(
				"Esse programa faz a soma de todos os numeros pares de um até o numero desejado, em qual numero você quer terminar o contador? ");
		num = sc.nextInt();

		if (num > 1) {
			while (loop <= num) {
				if (loop % 2 == 0) 
					soma += loop;
					loop++;
				
			}
			System.out.printf("A soma dos números pares entre 1 e %d é %d", num, soma);
		} else {
			System.out.println("O numero tem que ser maior do que 1");
		}
		sc.close();
	}

}
