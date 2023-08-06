//Pegue três números do usuário e imprima o maior número.

package ifelse;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior numero.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior numero");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " é o maior numero");
		}else {
			System.out.println("isso não é um numeral inteiro"); 
		}
	}

}
