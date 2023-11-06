/*Escreva um programa Java, para verificar se um determinado número é primo ou não.*/
package lacowhile;

import java.util.Scanner;

public class While17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número inteiro positivo: ");
	        int numero = sc.nextInt();

	        boolean ehPrimo = ehPrimo(numero);

	        if (ehPrimo) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }

	        sc.close();
	    }

	    
	    public static boolean ehPrimo(int numero) {
	        if (numero <= 1) {
	            return false; 
	        }
	        if (numero <= 3) {
	            return true; 
	        }
	        if (numero % 2 == 0 || numero % 3 == 0) {
	            return false; 
	        }

	        int i = 5;
	        while (i * i <= numero) {
	            if (numero % i == 0 || numero % (i + 2) == 0) {
	                return false; 
	            }
	            i += 6; 
	        }

	        return true;
	    }
	}