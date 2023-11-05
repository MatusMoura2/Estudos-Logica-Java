/*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com ousuário;*/

package campgemini.sintax;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {

		String imput01 = JOptionPane.showInputDialog("Qual a cotação do dolar para hoje?");
		String imput02 = JOptionPane.showInputDialog("Quanto você tem em dolar?");

		double cotação = Double.parseDouble(imput01);
		double valorDolar = Double.parseDouble(imput02);

		JOptionPane.showMessageDialog(null, "O seu valor em real Brasileiro é de : " + (cotação * valorDolar) + "R$");

	}

}
