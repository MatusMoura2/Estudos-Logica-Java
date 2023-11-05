/*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius; */
package campgemini.sintax;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int celsius;
		int fahrenheit;
		
		System.out.print("Qual temperatura será convertida?");
		celsius = sc.nextInt();
		
		fahrenheit = (9*celsius+160)/5;
		
		System.out.println(celsius+"° convertido para fharenheit fica "+fahrenheit+"°F");

	}

}
