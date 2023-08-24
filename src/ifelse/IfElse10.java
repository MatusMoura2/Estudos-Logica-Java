// Escreva um programa Java para inserir e exibir sua senha

package ifelse;

import java.util.Scanner;

public class IfElse10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String senhaTrue = "12345";
		
		System.out.print("Digite a sua senha: ");
		
		String senha = sc.nextLine();
		
		if (senhaTrue.equals(senha)) {
			System.out.printf("Senha %s é verdadeira",senha);
		}else {
			System.out.printf("Senha %s é falsa",senha);
		}
		
		

	}

}
