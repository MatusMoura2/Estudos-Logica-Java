/*Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos;
*/
package campgemini.sintax;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		String input01 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String input02 = JOptionPane.showInputDialog("Digite o segundo numero: ");

		int num1 = Integer.parseInt(input01);
		int num2 = Integer.parseInt(input02);

		JOptionPane.showMessageDialog(null, "A soma entre " + num1 + " e " + num2 + " é " + (num1 + num2));
		JOptionPane.showMessageDialog(null, "A subitração entre " + num1 + " e " + num2 + " é " + (num1 - num2));
		JOptionPane.showMessageDialog(null, "A multiplicação entre " + num1 + " e " + num2 + " é " + (num1 * num2));
		JOptionPane.showMessageDialog(null,
				"A divisão " + num1 + " e " + num2 + " é " + (num1 / num2) + " com resto " + (num1 % num2));

	}

}
