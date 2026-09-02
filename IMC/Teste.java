import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        String alturaString = JOptionPane.showInputDialog("Digite sua Altura: ");
        double alturaDouble = Double.parseDouble(alturaString);
        String pesoString = JOptionPane.showInputDialog("Digite seu Peso");
        double pesoDouble = Double.parseDouble(pesoString);
        double imc = pesoDouble / (alturaDouble * alturaDouble);
        JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc);
    }
}
    