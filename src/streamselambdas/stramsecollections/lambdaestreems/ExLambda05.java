/**
* 5. Média de Números
*Dada uma lista de números, calcule a média dos números.

*Exemplo de Entrada:

*List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
*Saída Esperada:

*30.0
*/
package lambdaestreems;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ExLambda05 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();

		Double averageValue = average.isPresent() ? average.getAsDouble() : 0;
		
		System.out.println(averageValue);

	}

}
