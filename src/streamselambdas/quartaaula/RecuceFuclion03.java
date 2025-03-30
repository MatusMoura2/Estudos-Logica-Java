package quartaaula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class RecuceFuclion03 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// reduce soma com identidade
		Integer reduce = list.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.print(reduce);
		System.out.println(" reduce soma com identidade");

		System.out.println("-------------------------------------------------");

		Integer reduce2 = list.stream().reduce(1, (n1, n2) -> n1 * n2);
		System.out.print(reduce2);
		System.out.println(" reduce multiplicação com identidade");

		System.out.println("-------------------------------------------------");

		// reduce - menor valor
		double minvalue = DoubleStream.of(1.5, 2.8, 1.6, 4.0, 5.1, 3.0).reduce(Double.POSITIVE_INFINITY,
				(d1, d2) -> Math.min(d1, d2));
		System.out.println(minvalue);
		
		System.out.println("-------------------------------------------------");
		
		
	}

}
