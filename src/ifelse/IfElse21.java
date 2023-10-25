/*Construa um algoritmo que calcule o peso ideal de uma pessoa.
 *  Dados de entrada: altura e sexo. 
 *  Fórmulas para cálculo do peso: 
 *  peso ideal de homem = (72,7 * altura) - 58 
 *  peso ideal da mulher = (62,1 * altura) - 44,7
 */
package ifelse;

import java.util.Scanner;

public class IfElse21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sexo;
		double peso;
		double altura;

		System.out.print("Qual o seu sexo? M p/masculino F p/feminino: ");
		sexo = sc.nextLine().trim().toUpperCase();

		System.out.print("Digite o seu peso: ");
		peso = sc.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura = sc.nextDouble();
		
		if(sexo.equals("M")) {
			if(altura*peso <= 58) {
				System.out.println("Peso ideal!");
			}else {
				System.out.println("Fora de forma!");
			}
		}else if(sexo.equals("F")){
			if(altura*peso <= 44.7) {
				System.out.println("Peso ideal!");
			}else {
				System.out.println("Fora de forma!");
			}
		}else {
			System.out.println("Não é um sexo valido!");
		}
		
		sc.close();

	}

}
