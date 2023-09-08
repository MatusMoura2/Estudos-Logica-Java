package classesesuasfuncionalidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class JoptionPene02 {
	    private List<String> alunos;

	    public JoptionPene02 () {
	        alunos = new ArrayList<>();
	    }

	    public void cadastrarAluno() {
	        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
	        if (nome != null && !nome.isEmpty()) {
	            alunos.add(nome);
	            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "Nome do aluno não pode ser vazio.");
	        }
	    }

	    public void listarAlunos() {
	        if (alunos.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
	        } else {
	            StringBuilder lista = new StringBuilder("Lista de Alunos:\n");
	            for (String aluno : alunos) {
	                lista.append(aluno).append("\n");
	            }
	            JOptionPane.showMessageDialog(null, lista.toString());
	        }
	    }

	    public static void main(String[] args) {
	    	JoptionPene02  cadastro = new JoptionPene02 ();
	        while (true) {
	            String opcao = JOptionPane.showInputDialog("Escolha uma opção:\n1 - Cadastrar Aluno\n2 - Listar Alunos\n3 - Sair");
	            if (opcao == null || opcao.equals("3")) {
	                break;
	            } else if (opcao.equals("1")) {
	                cadastro.cadastrarAluno();
	            } else if (opcao.equals("2")) {
	                cadastro.listarAlunos();
	            } else {
	                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
	            }
	        }
	    }
	
}
