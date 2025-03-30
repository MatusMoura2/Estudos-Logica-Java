/*
 * Java 08
 */
package terceiraaula;

import java.util.Optional;

public class Optional02 {

	public static void main(String[] args) {

		String num01 = "1a";

		Optional<Integer> number = conversorInNumbers(num01);
		
		number.ifPresent(n -> System.out.println(n));
		number.orElse(5);

		System.out.println(number.isPresent());
		System.out.println(number);

	}

	public static Optional<Integer> conversorInNumbers(String numStr) {

		try {
			Integer valueOf = Integer.valueOf(numStr);
			return Optional.of(valueOf);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

}