package quintaaula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collect01 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// supplier-fornecedor
		// accumulator-acumulador
		// combiner-combinação
		List<Integer> collecList = list.stream().collect(() -> new ArrayList<>(), 
				(l, e) -> l.add(e), 
				(l1, l2) -> l1.addAll(l2));
		
		System.out.println(collecList);
		System.out.println(list);
		System.out.println("----------------------------------------------------------");
		
		//toList
		
		List<Integer> collecList2 = list.stream()
				.filter((n) -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(collecList2);
		System.out.println("----------------------------------------------------------");
		
		//toSet
		
		Set<Integer> collecList3 = list.stream()
				.filter((n) -> n % 2 == 0)
				.collect(Collectors.toCollection(() -> new TreeSet<>()));//metodo toCollection() eu posso escolher a 
		System.out.println(collecList3);								 //implementação da Collection que eu quiser
		System.out.println("----------------------------------------------------------");
		
		//join - serve para unir String
		
		String join01 = list.stream()
				.map(n -> n.toString())//transforma todos os elementos em String antes de concatenar.
				.collect(Collectors.joining("; "));
		System.out.println(join01);
		System.out.println("----------------------------------------------------------");
		
		//averaging - tira a media de todos os elementos
		
		Double media = list.stream().collect(Collectors.averagingInt( n -> n.intValue()));
		System.out.println(media);
		System.out.println("----------------------------------------------------------");
		
		//summing - soma todos os elementos da lista
		
		Integer soma = list.stream().collect(Collectors.summingInt( n -> n.intValue()));
		System.out.println(soma);
		System.out.println("----------------------------------------------------------");
		
		//counting - diz quantos elementos tem em uma lista
		
		Long collect4 = list.stream().collect(Collectors.counting());
		System.out.println(collect4);
		System.out.println("----------------------------------------------------------");
		
		//min - pega o menor elemento de uma lista /max - pega o maior elemento de uma lista
		
		list.stream().collect(Collectors.minBy(Comparator.naturalOrder())).ifPresent(System.out::println);
		list.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).ifPresent(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		//summarizing - nos da um monte de possibilidades
		
		IntSummaryStatistics soma2 = list.stream().collect(Collectors.summarizingInt( n -> n.intValue()));
		System.out.println(soma2.getAverage());
		System.out.println(soma2.getCount());
		System.out.println(soma2.getMax());
		System.out.println(soma2.getMin());
		System.out.println(soma2.getSum());
		System.out.println("----------------------------------------------------------");
		
		//groupinBy - retorna um Map de acordo com a logica escolhida pelo programador
		
		Map<Integer, List<Integer>> groupinByEx01 = list.stream().collect(Collectors.groupingBy((n) -> n % 3));
		System.out.println(groupinByEx01);
		System.out.println("----------------------------------------------------------");
		
		//partitioningBy - agrupa sempre em true e false e retorna dois grupos
		
		Map<Boolean, List<Integer>> groupinByEx02 = list.stream().collect(Collectors.partitioningBy((n) -> n % 3 == 0));
		System.out.println(groupinByEx02);
		System.out.println("----------------------------------------------------------");
		
		//toMap
		
		Map<Integer, Integer> groupinByEx03 = list.stream().collect(Collectors.toMap((n) -> n, n -> n * 5));
		System.out.println(groupinByEx03);
	}

}
