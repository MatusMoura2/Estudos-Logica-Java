package ifelse;

import java.util.Scanner;

public class IfElse09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		int ano = sc.nextInt();

		if (isAnoBissexto(ano)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

		sc.close();
	}

	/*Neste exemplo, o programa lê um ano do usuário e passa esse ano para o método isAnoBissexto,
	 *  que verifica se o ano é bissexto. O método verifica se o ano é divisível por 
	 * 4 e não é divisível por 100, ou se é divisível por 400. Se qualquer uma dessas 
	 * condições for atendida, o ano é considerado bissexto.*/
	static boolean isAnoBissexto(int ano) {
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
