package sextaaula;

import java.util.stream.IntStream;
/*
 * Maneiras diferentes de escrever expressão lambda
 */
public class Treino01 {

	public static void main(String[] args) {

		//maneira comum
		IntStream.range(0, 11).filter(n -> n % 2 == 0).forEach(System.out::println);
		
		//quando temos que informar o tipo da variavel o parentese é obrigatorio
		IntStream.range(0, 11).filter((int n) -> n % 2 == 0).forEach(System.out::println);
		
		//quande temos mais de um argumento o parentese é obrigatorio
		IntStream.range(0, 11).filter(n -> n % 2 == 0).reduce((n1, n2) -> n1 + n2);
		
		//Quando eu não tenho nehum argumento parentese é obrigatorio
		Runnable runnable = () -> System.out.println("Trabalhar na fugioka é bom demais!");
		runnable.run();
		
		/**
		 * Chaves
		 */
		// sempre que se coloca chaves é nescesario o uso do return
		IntStream.range(0, 11).filter((n) -> {return n % 2 == 0; }).forEach(System.out::println);

	}

}
