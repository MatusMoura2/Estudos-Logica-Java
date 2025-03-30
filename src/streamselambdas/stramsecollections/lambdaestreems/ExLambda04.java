/**
 * 4. Contagem de Strings Longas
*Dada uma lista de strings, conte quantas strings têm mais de 5 caracteres.

*Exemplo de Entrada:


*List<String> palavras = Arrays.asList("java", "lambda", "stream", "api", "programming");
*Saída Esperada:

*3
*/
package lambdaestreems;

import java.util.Arrays;
import java.util.List;

public class ExLambda04 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("java", "lambda", "stream", "api", "programming");
		
		long count = words.stream().filter(s -> s.length() > 5).count();
		
		System.out.println(count);
	}

}
