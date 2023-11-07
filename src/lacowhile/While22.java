/*Escreva um programa Java, para converter um número binário em 
 * decimal sem usar (Array) – Tema que iremos abordar, após, Loops.
 */
package lacowhile;

import java.util.Scanner;

public class While22 {


	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número binário: ");
	        String binary = sc.next();
	        
	        int decimal = 0;
	        int base = 1; 
	        int index = binary.length() - 1; 

	        while (index >= 0) {
	            char bit = binary.charAt(index);
	            
	            if (bit == '1') {
	                decimal += base;
	            }
	            
	            base *= 2;
	            index--; 
	        }
	        
	        System.out.println("O número decimal correspondente é: " + decimal);
	        sc.close();
	    }
	}