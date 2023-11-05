/*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
trocados; */
package campgemini.sintax;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.print("Digite um numero inteiro para a variavel a : ");
		a = sc.nextInt();

		System.out.print("Digite outro numero inteiro para a variavel b: ");
		b = sc.nextInt();

		System.out.printf("Você digitou %d para a e %d para b ", a, b);
		if (a != b) {
			int ab = a;
			a = a - a + b;
			b = b - b + ab;
			System.out.printf("agora a= %d e b= %d",a,b);
		} else {
			System.out.printf("as variaveis %d e %d são iguais", a, b);
		}
		
	}

}
