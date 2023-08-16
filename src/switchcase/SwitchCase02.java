/*Escreva um programa em Java para ler o gênero (M/F)
 *e imprimir o gênero correspondente usando uma instrução switch*/
package switchcase;

import java.util.Scanner;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char genero;
		var mM = "Masculino";
		var fF = "Feminino";

		System.out.print("Digite uma letra que corresponda a um genero M para masculino e F para feminino:");
		
		genero = sc.next().charAt(0);
		
		switch (genero) {
		
		case 'M':
			System.out.println(mM);
			break;
			
		case 'm':
			System.out.println(mM);
			break;
			
		case 'f':
			System.out.println(fF);
			break;
			
		case 'F':
			System.out.println(fF);
			break;
			
		default:
			System.out.println("Esse caracter não representa um sexo!");
		}
	}

}
