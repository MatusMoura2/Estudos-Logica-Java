/*
 * Mapeamento de Strings: Dada uma lista de strings, converta todas para maiúsculas usando map.
 */
package desafioslambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio03 {

	public static void main(String[] args) {
		
		List<String> family = Arrays.asList("Eu","Amo", "a","minha","família");
		
		List<String> family2 = family.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(family2);

	}

}
