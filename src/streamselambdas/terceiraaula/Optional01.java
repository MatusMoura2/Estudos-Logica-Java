/*
 * Java 07
 */
package terceiraaula;

public class Optional01 {

	public static void main(String[] args) {

		String num01 = "100";

		Integer conversorInNumbers = conversorInNumbers(num01);

		System.out.println(conversorInNumbers);

	}

	public static Integer conversorInNumbers(String numStr) {
		return Integer.valueOf(numStr);
	}

}
