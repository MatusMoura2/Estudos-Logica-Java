package POO.pessoa;

import java.util.Scanner;

public class Person {
	
	Scanner sc = new Scanner(System.in);

	private String name;
	private int idade;
	
	
	
	
	public Person(Scanner sc, String name, int idade) {
		this.name = name;
		this.idade = idade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		name = sc.nextLine();
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		idade = sc.nextInt();
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", idade=" + idade + "]";
	}
	
	
}
