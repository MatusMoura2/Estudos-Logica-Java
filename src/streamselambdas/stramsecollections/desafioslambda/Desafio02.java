/*
 * Soma de Elementos: Calcule a soma de todos os elementos de uma lista de inteiros usando reduce
 */
package desafioslambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio02 {

	public static void main(String[] args) {

		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Optional<Integer> soma = list.stream().reduce((n1, n2) -> n1 + n2);
		System.out.println(soma);
	}

}
