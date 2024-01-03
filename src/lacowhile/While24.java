/*Escreva um programa Java, para imprimir todos os números fortes de 1 a 100.000.
 * 
 */

package lacowhile;


public class While24 {
	
	// Função para calcular o fatorial de um número
    static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    // Função para verificar se um número é forte
    static boolean ehNumeroForte(int numero) {
        int original = numero;
        int somaFatoriais = 0;

        while (numero > 0) {
            int digito = numero % 10;
            somaFatoriais += fatorial(digito);
            numero /= 10;
        }

        return somaFatoriais == original;
    }

	public static void main(String[] args) {
		
		System.out.println("Números fortes de 1 a 100000:");

        int numero = 1;

        while (numero <= 100000) {
            if (ehNumeroForte(numero)) {
                System.out.println(numero);
            }
            numero++;
        }

	}

}
