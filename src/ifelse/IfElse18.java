package ifelse;

import java.util.Scanner;

public class IfElse18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            int valor = sc.nextInt();

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        sc.close();
	}

}
