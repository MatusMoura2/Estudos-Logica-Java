//Escreva um programa Java, para imprimir todos os números perfeitos de 1 a 10.000.
 
package lacowhile;

public class While25 {
	
	    // Função para verificar se um número é perfeito
	    static boolean ehNumeroPerfeito(int numero) {
	        int somaDivisores = 0;
	        int i = 1;

	        while (i < numero) {
	            if (numero % i == 0) {
	                somaDivisores += i;
	            }
	            i++;
	        }

	        return somaDivisores == numero;
	    }

	    public static void main(String[] args) {
	        System.out.println("Números perfeitos de 1 a 10000:");

	        int numero = 1;

	        while (numero <= 10000) {
	            if (ehNumeroPerfeito(numero)) {
	                System.out.println(numero);
	            }
	            numero++;
	        }
	    }
	}