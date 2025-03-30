package setimaaula;

import java.util.Arrays;
import java.util.List;

public class Treino02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		list.stream().forEach(System.out::println);//reference method 

		list.stream().forEach((n) -> System.out.println(n)); //not reference method
	}
}
