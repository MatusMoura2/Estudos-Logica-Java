package quartaaula;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RecuceFuclion02 {

	public static void main(String[] args) {

		String worlds = "Eu amo a minha familia!";
		String[] split = worlds.split(" ");
		List<String> list = Arrays.asList(split);

		Optional<String> concat = list.stream().reduce((s1, s2) -> s1.concat(s2));
		System.out.println(concat.get());
		System.out.println("reduce concatenação");

		System.out.println("-------------------------------------------------");

		String concat2 = list.stream().reduce("",(s1, s2) -> s1.concat(s2));
		System.out.println(concat2);
		System.out.println("reduce concatenação com identidade");
	}

}