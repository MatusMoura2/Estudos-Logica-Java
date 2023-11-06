/*Escreva um programa Java, para inserir 
 * os números até que o usuário queira e 
 * ao final o programa deverá exibir os maiores 
 * e menores números digitados.
 */
package lacowhile;

import java.util.Scanner;

public class While20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // Inicialize com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicialize com o maior valor possível

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número (ou digite 0 para encerrar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                continuar = false; // Encerra o loop
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado é: " + maior);
            System.out.println("O menor número digitado é: " + menor);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
