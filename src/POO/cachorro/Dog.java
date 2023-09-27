package POO.cachorro;

import java.util.Scanner;

public class Dog {

	Scanner sc = new Scanner(System.in);

	private String nome;
	private String raca;

	public Dog(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = sc.nextLine();
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		raca = sc.nextLine();
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "[nome= " + nome + ", raca= " + raca + "]";
	}
	

}
