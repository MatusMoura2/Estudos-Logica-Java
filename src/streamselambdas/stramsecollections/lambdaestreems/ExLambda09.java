/**
 * 9. Agrupamento por Tamanho
Dada uma lista de strings, agrupe-as pelo seu tamanho.

Exemplo de Entrada:


List<String> palavras = Arrays.asList("java", "lambda", "stream", "api", "programming");
Saída Esperada:

{3=[api], 4=[java], 6=[lambda, stream], 11=[programming]}
 */
package lambdaestreems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExLambda09 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "lambda", "stream", "api", "programming");
		
		Map<Object, List<String>> newList2 = words.stream()
				.collect(Collectors.groupingBy(w -> w.length()));

		System.out.println(newList2);
	}

}
