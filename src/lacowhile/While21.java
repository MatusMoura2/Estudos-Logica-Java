/*Escreva um programa Java, para imprimir o número e 
 * a soma de todos os inteiros entre 100 e 200 que são divisíveis por 9
 */
package lacowhile;

public class While21 {

	public static void main(String[] args) {
		int num = 100;
		int soma = 0;
		
		while(num<=200) {
			   while (num <= 200) {
		            if (num % 9 == 0) {
		            	System.out.println("Números divisiveis por 9: "+num);
		                soma += num;
		            }
		            num++;
		        }

		        System.out.println("A soma dos números divisíveis por 9 entre 100 e 200 é: " + soma);
		    }
		}

	}


