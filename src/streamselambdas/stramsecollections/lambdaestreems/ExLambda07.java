/**
* 7. Números Únicos
*Dada uma lista de números com duplicatas, use Stream para remover as duplicatas e imprima os números únicos.

*Exemplo de Entrada:
*List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
Saída Esperada:
1
2
3
4
5
 */
package lambdaestreems;

import java.util.Arrays;
import java.util.List;

public class ExLambda07 {

	public static void main(String[] args) {
		
		List<Integer> numbList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		numbList.stream().distinct().forEach(e -> System.out.println(e));
		
	}

}
