package quartaaula;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RecuceFuclion01 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		//imprime a lista
		list.stream().forEach(System.out::print);
		
		System.out.println("\n-------------------------------------------------");
		
		// reduce soma
		Optional<Integer> reduce = list.stream().reduce((n1, n2) -> n1 + n2);
		System.out.print(reduce.get());
		System.out.println(" reduce soma");
		
		System.out.println("-------------------------------------------------");

		// reduce multiplicação
		Optional<Integer> reduce2 = list.stream().reduce((n1, n2) -> n1 * n2);

		System.out.print(reduce2.get());
		System.out.println(" reduce multiplicação");

		System.out.println("-------------------------------------------------");
		
		//reduce divisão
		Optional<Integer> reduce3 = list.stream().reduce((n1, n2) -> n1 / n2);

		System.out.print(reduce3.get());
		System.out.println(" reduce divisão");
		
		System.out.println("-------------------------------------------------");
		
		//reduce subitração
		Optional<Integer> reduce4 = list.stream().reduce((n1, n2) -> n1 - n2);

		System.out.print(reduce4.get());
		System.out.println(" reduce subitração");
		
		
	}

}
