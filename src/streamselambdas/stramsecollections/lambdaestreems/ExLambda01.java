/**
*Filtragem de Números Pares
*Dada uma lista de números, use Stream para filtrar apenas os números pares e imprimi-los.

*Exemplo de Entrada:

*List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
*Saída Esperada:

*2
*4
*6
*8
*10
*/

package lambdaestreems;

import java.util.Arrays;
import java.util.List;

public class ExLambda01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
