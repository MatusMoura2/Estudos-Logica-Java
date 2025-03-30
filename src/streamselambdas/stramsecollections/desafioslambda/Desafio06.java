//Remoção de Duplicatas: Remova elementos duplicados de uma lista usando distinct.
package desafioslambda;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,4,9,5, 2, 3, 4, 5, 6, 7, 8, 9, 10,8,9,6);

		list.stream().distinct().forEach(System.out::println);
	}

}
