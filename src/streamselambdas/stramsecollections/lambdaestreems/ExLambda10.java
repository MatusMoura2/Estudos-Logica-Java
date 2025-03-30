/*
10. Ordenação Personalizada
Dada uma lista de strings, ordene-as primeiro pelo tamanho e depois alfabeticamente.

Exemplo de Entrada:

List<String> palavras = Arrays.asList("java", "lambda", "stream", "api", "programming");
Saída Esperada:

api
java
lambda
stream
programming
 */
package lambdaestreems;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExLambda10 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "lambda", "stream", "api", "programming");
		
		List<String> newList = words.stream().sorted( Comparator.comparingInt(String::length)).collect(Collectors.toList());
		
		newList.forEach(System.out::println);
	}

}
