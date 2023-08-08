/*Essa é a classe da biblioteca Swing JOptionPane,
 *  com ela podemos criar pop-up
 * e interfaces graficas com Java.
 * Aqui vemos um exemplo de uma calculadora com essa classe.*/

package classesesuasfuncionalidades;

import javax.swing.JOptionPane;

public class JOptionPane01 {

	public static void main(String[] args) {
		double num1;
    	double num2;
    	String[] calculo = {"+", "-", "*", "/","%"};//vetor que guarda em memoria todas as operações possiveis desta calculadora
    	
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");//showInputDialog:Mostra uma caixa de diálogo de mensagem de pergunta, solicitando entrada do usuário
        num1 = Double.parseDouble(input1);

        
        String inputOperacao = (String) JOptionPane.showInputDialog(null, "Selecione a operação:", "Calculadora",
                JOptionPane.QUESTION_MESSAGE, null, calculo, calculo[0]);//Tipo de mensagem, usado pela interface do usuário para determinar qual ícone exibir(no caso QUESTION_MESSAGE)

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        num2 = Double.parseDouble(input2);

        double resultado = 0;
        switch (inputOperacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "%":
                resultado = num2 * (num1 / 100);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                return;
        }

       
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);//showMessageDialog:Abre uma caixa de diálogo de mensagem de informações intitulada "Mensagem"

	}

}
