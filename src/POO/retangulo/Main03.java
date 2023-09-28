/*Escreva um programa Java para criar uma classe chamada “Retângulo” 
 * com atributos de largura e altura. Calcule a área e o perímetro do retângulo.
 */
//OBS: me emolguei um pouco nesse aqui! rsrsr
package POO.retangulo;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float lado01;
		float lado02;
		float lado03;
		float lado04;
		float area = 0;
		float perimetro = 0;

		System.out.print("Digite o valor do primeiro lado do retângulo: ");
		lado01 = sc.nextFloat();

		System.out.print("Digite o valor do segundo lado do retângulo: ");
		lado02 = sc.nextFloat();

		System.out.print("Digite o valor do terceiro lado do retângulo: ");
		lado03 = sc.nextFloat();

		System.out.print("Digite o valor do quarto lado do retângulo: ");
		lado04 = sc.nextFloat();

		if (lado01 == lado03 && lado02 == lado04 && lado01 != lado02 && lado03 != lado04) {// Para termos um retangulo
																							// os lados opostos tem que
																							// se iguais e ter lados
																							// visinhos diferentes.
			Retangulo retangulo = new Retangulo(lado01, lado02, lado03, lado04);

			System.out.print("Digite A para calcular a área ou P para calcular o perimetro: ");

			String calc = sc.next().toUpperCase();

			if (calc.equals("A")) {
				area = Calcula.calcularArea(retangulo);
				System.out.println("A área do retangulo é " + area+"m²");
				
			}else if (calc.equals("P")) {
				perimetro = Calcula.calcularPerimetro(retangulo);
				System.out.println("O perimetro do retangulo é " + perimetro+" m²");
				
			}else {
				 System.out.println("Opção inválida. Escolha 'A' para área ou 'P' para perímetro.");
				 
			}
		}else {
			 System.out.println("Os lados não formam um retângulo, pois todos os lados opostos devem ter medidas iguais"
			 		+ " e lados visinhos medidas diferentes.");
			
		}

	}

}
