/**
*6. Concatenção de Strings
*Dada uma lista de strings, concatene todas as strings em uma única string, separadas por vírgula.

*Exemplo de Entrada:

*List<String> palavras = Arrays.asList("java", "lambda", "stream");
*Saída Esperada:
*java,lambda,stream
*/
package lambdaestreems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExLambda06 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "lambda", "stream");
		
		String worldsconcat = words.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(", "));
		
		System.out.println(worldsconcat);
	}

}
