/*Criando game Pedra Papel e Tesoura*/

package vetorArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		//Outra maneira de pegar o imput do usuario é utilizando a classe BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();

		String[] opc = { "Pedra", "Papel", "Tesoura" };

		String escolhaUsuarioString = "";

		System.out.println("Escolha sua jogada: 0 - Pedra, 1 - Papel, 2 - Tesoura");

		try {
			escolhaUsuarioString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int escolhaUsuario = Integer.parseInt(escolhaUsuarioString);

		if (escolhaUsuario < 0 || escolhaUsuario > 2) {
			System.out.println("Opção inválida. Encerrando o jogo.");
			return;
		}

		int escolhaComputador = rd.nextInt(3);

		System.out.println("Você escolheu: " + opc[escolhaUsuario]);
		System.out.println("Computador escolheu: " + opc[escolhaComputador]);

		if (escolhaUsuario == escolhaComputador) {
			System.out.println("___________________ \n");
			System.out.println("Empate!");
		} else if ((escolhaUsuario == 0 && escolhaComputador == 2) || (escolhaUsuario == 1 && escolhaComputador == 0)
				|| (escolhaUsuario == 2 && escolhaComputador == 1)) {
			System.out.println("____________________ \n");
			System.out.println("Você venceu!");
		} else {
			System.out.println("____________________ \n");
			System.out.println("Computador venceu!");
		}

	}
}
