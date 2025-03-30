/*
 * Ordenação de Strings: Ordene uma lista de strings em ordem alfabética usando Streams.
 */
package desafioslambda;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a","y","s","d","f","g","h","j","z","k","j","h","g","h","j","j","h","g");
		
		list.stream().sorted(String::compareTo).forEach(System.out::print);
		
	}

}
