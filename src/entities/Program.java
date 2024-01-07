package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Dennis");
		list.add("Bruna");
		list.add("Anna");
		list.add("Pedro");
		list.add(2, "Marco");
		
		System.out.println("List size: " + list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("\n---Remove if start with letter 'M'---");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String startLetterM : list) {
			System.out.println(startLetterM);
		}
		
		System.out.println("\n---Find position of name 'Bob'---");
		System.out.println("Index of Bob: " + list.indexOf("Bruna"));

		System.out.println("\n---Filtering names that start with the letter A---");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String findA : result) {
			System.out.println(findA);
		}
		
		System.out.println("\n---Finding the first name that start with letter A---");
		String findFirstA = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(findFirstA);
	}

}
