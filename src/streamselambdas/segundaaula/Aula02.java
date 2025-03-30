package segundaaula;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Aula02 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 1, 3, 4, 5, 8, 4, 5, 8, 3, 2, 5, 7, 6, 2, 8, 9, 2);

		//Java 4
		for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		System.out.println("------------------------------------------------");
		
		//Java 5
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		System.out.println("------------------------------------------------");
		
		//Java 8
		numbers.stream().forEach(e -> System.out.println(e));

	}

}
