/*Crie uma classe chamada Carro com os atributos marca, modelo e ano.
 *Implemente um construtor que receba esses três valores como parâmetros 
 *e inicialize os atributos da classe. Crie também um método chamado exibirInformacoes() 
 *que imprima os valores dos atributos na tela
 */

package POO.carro;

public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Ford", "Ka",2023);
		
		String infotmacoesCarro1 = carro1.exibirInformacoes();
		
		System.out.println(infotmacoesCarro1);

	}

}
