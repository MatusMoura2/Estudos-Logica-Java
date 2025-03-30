/**
 * 8. Maior Número
Dada uma lista de números, encontre o maior número usando Stream.

Exemplo de Entrada:

List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
Saída Esperada:

50
 */
package lambdaestreems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExLambda08 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		Optional<Integer> numMax = numbers.stream().max(Comparator.naturalOrder());
		
		System.out.println(numMax.get());
	}

}
