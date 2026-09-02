package Saudação;
import javax.swing.JOptionPane;

public class saudação {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?: ");
        String cidade = JOptionPane.showInputDialog("Qual a cidade em que você nasceu?: ");
        JOptionPane.showMessageDialog(null, "Oi " + nome + "! Que legal saber que sua cidade natal é " + cidade);
    }
}
