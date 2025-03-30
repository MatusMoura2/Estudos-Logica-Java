package segundaaula;

import java.util.Arrays;
import java.util.List;

public class Aula022 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 1, 3, 4, 5, 8, 4, 5, 8, 3, 2, 5, 7, 6, 2, 8, 9, 2, 3, 4, 4, 5, 4, 6, 5,
				6, 8, 9, 7, 5, 1, 4, 7);

		// Operações intermediarias ex:skip(),limit(), distinct(),filter
		numbers.stream()
		.filter(e -> e % 2 == 0).
		distinct().
		skip(1).
		limit(40).
		forEach(e -> System.out.println(e));//operação final
		

	}

}
