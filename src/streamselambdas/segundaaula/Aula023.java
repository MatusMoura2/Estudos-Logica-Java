package segundaaula;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aula023 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 1, 3, 4, 5, 8, 0, 4, 5, 8, 3, 2, 5, 7, 9);

		Stream<Integer> map = numbers.stream().distinct().limit(5).map(e -> e * 2);

		map.forEach(e -> System.out.println(e));

		System.out.println("------------------------------------");

		long count = numbers.stream().filter(e -> e % 2 == 0).count();

		System.out.println(count);

		System.out.println("------------------------------------");

		Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());

		System.out.println(max.get());

		System.out.println("------------------------------------");

		Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

		System.out.println(min.get());

		System.out.println("------------------------------------");

		List<Integer> newList = numbers.stream().filter(e -> e % 3 == 0).map(e -> e * 2).collect(Collectors.toList());

		System.out.println(newList);

		System.out.println("------------------------------------");

		Map<Boolean, List<Integer>> newList2 = numbers.stream().map(e -> e * 3)
				.collect(Collectors.groupingBy(e -> e % 2 == 0));

		System.out.println(newList2);

		System.out.println("------------------------------------");

		String collect = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining("; "));

		System.out.println(collect);
	}

}
