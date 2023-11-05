/*Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No finalinformar o nome do aluno e a sua média (aritmética);*/
package campgemini.sintax;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		String input01 = JOptionPane.showInputDialog("Qual a nota da primeira prova? ");
		String input02 = JOptionPane.showInputDialog("Qual a nota da primeira prova? ");
		String input03 = JOptionPane.showInputDialog("Qual a nota da primeira prova? ");

		double nota1 = Double.parseDouble(input02);
		double nota2 = Double.parseDouble(input02);
		double nota3 = Double.parseDouble(input02);
		
		JOptionPane.showMessageDialog(null, "Olá "+nome+" a sua media é "+((nota1+nota2+nota3)/3));

	}

}
