/**
* 2. Soma dos Quadrados
*Dada uma lista de números, calcule a soma dos quadrados de todos os números.

*Exemplo de Entrada:

*List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

*Saída Esperada:
*55
 */

package lambdaestreems;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class ExLambda02 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int soma = numbers.stream().map(n -> n * n).reduce(0, Integer::sum);

		JOptionPane.showMessageDialog(null, soma);

	}

}
