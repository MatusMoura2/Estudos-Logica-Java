/**
* 3. Transformação de Strings
*Dada uma lista de strings, transforme todas as strings para maiúsculas e imprima-as.

*Exemplo de Entrada:

*List<String> palavras = Arrays.asList("java", "lambda", "stream");
*Saída Esperada:

*JAVA
*LAMBDA
*STREAM
*/
package lambdaestreems;

import java.util.Arrays;
import java.util.List;

public class ExLambda03 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Java", "Lambda", "stream");

		words.stream().map(String::toUpperCase).forEachOrdered(System.out::println);

	}

}
