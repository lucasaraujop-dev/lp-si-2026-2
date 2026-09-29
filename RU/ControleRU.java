package RU;
import javax.swing.JOptionPane;

public class ControleRU {
    public static void main(String[] args) {
        Aluno alunoCadastrado = null;
        int opcao = 0;

        while(opcao != 4) {
            String menu = "=== CONTROLE RU ==="+
                          "\n1 - Cadastrar Aluno"+
                          "\n2 - Exibir Dados do Aluno"+
                          "\n3 - Liberar Acesso ao RU"+
                          "\n4 - Sair"+
                          "\n\nEscolha uma opcão";

            String entrada = JOptionPane.showInputDialog(menu);

            opcao = Integer.parseInt(entrada);

            if (entrada == null){
                break;
            }

            switch(opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
                    String matricula = JOptionPane.showInputDialog("Digite a matricula: ");
                    String curso = JOptionPane.showInputDialog("Digite o curso do aluno: ");
                    String campus = JOptionPane.showInputDialog("Digite o Campus do Aluno");

                    alunoCadastrado = new Aluno(nome, matricula, curso, campus);

                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
                    break;
                case 2:
                    if (alunoCadastrado != null){
                        JOptionPane.showMessageDialog(null, alunoCadastrado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado!");
                    }
                    break;
                case 3:
                    if (alunoCadastrado != null){
                        JOptionPane.showMessageDialog(null, "Acesso Liberado! Bom apetite " + alunoCadastrado.getNome());
                    } else{
                        JOptionPane.showMessageDialog(null, "Acesso negado!");
                    }
                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrand o sistema...");
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida Tente novamente.");

            } 
        }
    }
}
