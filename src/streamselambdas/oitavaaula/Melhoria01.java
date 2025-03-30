package oitavaaula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Melhoria01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		// Collection
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream().forEach(System.out::println);

		// Array
		Integer[] intArray = new Integer[] { 1, 2, 3, 4, 5, 6 };
		Arrays.stream(intArray).forEach(System.out::println);

		// Stream.Of
		Stream.of("Eu", "Amo", "A", "Minha", "Familia").forEach(System.out::println);

		// IntStream.range
		IntStream.range(15, 25).forEach(System.out::println);

		// Stream.interate
		Stream.iterate(5, n -> n * 2).limit(20).forEach(System.out::println);

		// BufferedReader - lines
		// streams.txt -11,12,13
		File file = new File("src/streams.txt");
		FileReader in = new FileReader(file);
		try (BufferedReader bufferedReader = new BufferedReader(in)) {
			bufferedReader.lines().forEach(System.out::println);
		}

		//Files
		Path path = Paths.get("");
		Files.list(path).forEach(System.out::println);
		
		//Random
		Random ram = new Random();
		ram.ints().limit(10).forEach(System.out::println);
		
		//Pattern
		String input = "Eu amo a Beatriz";
		Pattern compile = Pattern.compile(" ");
		compile.splitAsStream(input).forEach(System.out::println);
	}

}
