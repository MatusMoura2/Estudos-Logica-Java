/*
 * Contagem de Elementos: Conte quantos elementos em uma lista são maiores que 10.
 */
package desafioslambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 8, 77, 80, 3, 4, 50, 13, 11, 10);

		Long maiorQ10 = list.stream()
				.filter(n -> n > 10)
				.collect(Collectors.counting());

		System.out.println(maiorQ10);
	}

}
