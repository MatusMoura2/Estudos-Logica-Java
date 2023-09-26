/* Escreva um programa Java para criar uma classe chamada "Pessoa" com um atributo 
 * nome e idade. Crie duas instâncias da classe “Person”,
 *  defina seus atributos usando o construtor e imprima seu nome e idade.
 */

package POO.pessoa;

public class Main {

	public static void main(String[] args) {
		
		Person per1 = new Person(null, null, 0);
		
		Person per2 = new Person(null, null, 0);
		
		System.out.print("Digite o nome da pessoa 01: ");
		per1.setName(null);
		System.out.print("Digite a idade da pessoa 01: ");
		per1.setIdade(0);
		
		System.out.print("Digite o nome da pessoa 02: ");
		per2.setName(null);
		System.out.print("Digite a idade da pessoa 02: ");
		per2.setIdade(0);
		
		System.out.println();
		
		System.out.println(per1.toString());
		System.out.println(per2.toString());
	}

}
