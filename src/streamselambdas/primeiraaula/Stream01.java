package primeiraaula;

import java.util.Arrays;
import java.util.List;

public class Stream01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		
		numbers.stream()
		//filter
		.filter(e-> e % 2 == 0)
		//forEach
		.forEach(e -> System.out.println(e));
	}
}
