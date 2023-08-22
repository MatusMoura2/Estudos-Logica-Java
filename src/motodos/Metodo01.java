/*Crie um método que recebe uma string como parâmetro 
 * e retorna true se a string for um palíndromo 
 * (ou seja, lê-se da mesma forma de trás para frente) 
 * e false caso contrário.*/
package motodos;

import java.util.Scanner;

public class Metodo01 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        if (isPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo!");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
        
        scanner.close();
    }
    
    static boolean isPalindromo(String palavra) {
        int tamanho = palavra.length();
        
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}

	


