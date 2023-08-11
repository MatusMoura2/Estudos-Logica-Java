/* Escreva um programa Java que leve o usuário a fornecer um único caractere do alfabeto. 
 * Imprima vogal ou consoante, dependendo da entrada do usuário. Se a entrada do usuário não 
 * for uma letra (entre a e z ou A e Z), ou for uma string de comprimento > 1*/
package ifelse;

import java.util.Scanner;

public class IfElse08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		var vog = "Vogal";
		var con = "Consoante";
		String letra;

		System.out.print("Digite uma letra do alfabeto: ");

		letra = sc.nextLine();

		/** SER DEV TAMBÉM ENVOLVE PESQUISAR SOBRE A TAREFA A SER FEITA
		 * 
		 * Tradicionalmente, havia apenas cinco vogais na língua portuguesa (a e i o u)
		 * e dezoito consoantes. Essa situação sofreu alteração com a entrada das letras
		 * k, y, w no alfabeto português:
		 * 
		 * O y é uma vogal porque representa o som [i]; O k é uma consoante porque
		 * representa o som [k]; O w é uma vogal quando representa o som [u] e uma
		 * consoante quando representa o som [v]
		 */
		
		if (letra.equals("a") || (letra.equals("A"))) {
			System.out.println(vog);
		} else if (letra.equals("b") || (letra.equals("B"))) {
			System.out.println(con);
		} else if (letra.equals("C") || (letra.equals("C"))) {
			System.out.println(con);
		} else if (letra.equals("d") || (letra.equals("D"))) {
			System.out.println(con);
		} else if (letra.equals("e") || (letra.equals("E"))) {
			System.out.println(vog);
		} else if (letra.equals("f") || (letra.equals("F"))) {
			System.out.println(con);
		} else if (letra.equals("g") || (letra.equals("G"))) {
			System.out.println(con);
		} else if (letra.equals("h") || (letra.equals("H"))) {
			System.out.println(con);
		} else if (letra.equals("i") || (letra.equals("I"))) {
			System.out.println(vog);
		} else if (letra.equals("j") || (letra.equals("J"))) {
			System.out.println(con);
		} else if (letra.equals("k") || (letra.equals("K"))) {
			System.out.println(con);
		} else if (letra.equals("l") || (letra.equals("L"))) {
			System.out.println(con);
		} else if (letra.equals("m") || (letra.equals("M"))) {
			System.out.println(con);
		} else if (letra.equals("n") || (letra.equals("N"))) {
			System.out.println(con);
		} else if (letra.equals("o") || (letra.equals("O"))) {
			System.out.println(vog);
		} else if (letra.equals("p") || (letra.equals("P"))) {
			System.out.println(con);
		} else if (letra.equals("q") || (letra.equals("Q"))) {
			System.out.println(con);
		} else if (letra.equals("r") || (letra.equals("R"))) {
			System.out.println(con);
		} else if (letra.equals("s") || (letra.equals("S"))) {
			System.out.println(con);
		} else if (letra.equals("t") || (letra.equals("T"))) {
			System.out.println(con);
		} else if (letra.equals("u") || (letra.equals("U"))) {
			System.out.println(con);
		} else if (letra.equals("v") || (letra.equals("V"))) {
			System.out.println(con);
		} else if (letra.equals("w") || (letra.equals("W"))) {
			System.out.println(con + " e " + vog);
		} else if (letra.equals("x") || (letra.equals("X"))) {
			System.out.println(con);
		} else if (letra.equals("y") || (letra.equals("Y"))) {
			System.out.println(vog);
		} else if (letra.equals("z") || (letra.equals("Z"))) {
			System.out.println(con);
		} else if (letra.length() > 1) {
			System.out.println("Digite apenas uma letra!");
		} else {
			System.out.println("Esse não é um caractere valido!");
		}
	}

}
