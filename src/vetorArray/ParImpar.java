package vetorArray;

import java.util.Scanner;

public class ParImpar {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int[] numeros = new int[20];
	        int[] par;
	        int[] impar;
	        int pares = 0;
	        int impares = 0;
	        
	        
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	            
	            if (numeros[i] % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	        
	        
	        par = new int[pares];
	        impar = new int[impares];
	        
	        int numPares = 0;
	        int numImpares = 0;
	        
	        for (int i = 0; i < 20; i++) {
	            if (numeros[i] % 2 == 0) {
	                par[numPares] = numeros[i];
	                numPares++;
	            } else {
	                impar[numImpares] = numeros[i];
	                numImpares++;
	            }
	        }
	        
	        System.out.println("Números pares:");
	        for (int i = 0; i < pares; i++) {
	            System.out.print(par[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Números ímpares:");
	        for (int i = 0; i < impares; i++) {
	            System.out.print(impar[i] + " ");
	        }
	    }
	}
