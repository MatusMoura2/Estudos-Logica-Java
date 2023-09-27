/*Escreva um programa Java para criar uma classe chamada "Cachorro" 
 * com um nome e um atributo de raça. Crie duas instâncias da classe "Dog", 
 * defina seus atributos usando o construtor e modifique os atributos usando os 
 * métodos setter e imprima os valores atualizados.
 * 
 */
package POO.cachorro;

public class Main02 {

	public static void main(String[] args) {
		
		Dog dog01 = new Dog(null, null);
		Dog dog02 = new Dog(null, null);
		
		System.out.print("Digite o nome do cachorro 01: ");
		dog01.setNome(null);
		System.out.print("Digite a raça do cachorro 01: ");
		dog01.setRaca(null);
		
		System.out.print("Digite o nome do cachorro 02: ");
		dog02.setNome(null);
		System.out.print("Digite a raça do cachorro 02: ");
		dog02.setRaca(null);
		
       System.out.println("As informacões do cachorro 01, são:");
       System.out.println(dog01.toString());
       
       System.out.println("As informacões do cachorro 02, são:");
       System.out.println(dog02.toString());
	}

}
