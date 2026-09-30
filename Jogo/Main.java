package Jogo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String time1 = JOptionPane.showInputDialog("Qual o primeiro time?: ");
        String golsTime1 = JOptionPane.showInputDialog("Quantidade de gols do time: ");
        int numGolsTime1 = Integer.parseInt(golsTime1);

        String time2 = JOptionPane.showInputDialog("Qual o segundo time?: ");
        String golsTime2 = JOptionPane.showInputDialog("Quantidade de gols do time: ");
        int numGolsTime2 = Integer.parseInt(golsTime2);

        Jogo jogo = new Jogo(time1, time2, numGolsTime1, numGolsTime2);

        String resultado;
        int diferencaVencedor;
        String vencedor;
        if (jogo.getNumGolsTime1() > jogo.getNumGolsTime2()) {
            resultado = "==== PLACAR DO JOGO ====\n"+
                        jogo.getNomeTime1() + "(" + jogo.getNumGolsTime1() + ")\n"+
                        "      X\n" +
                        jogo.getNomeTime2() + "(" + jogo.getNumGolsTime2() + ")";

                        diferencaVencedor =  jogo.getNumGolsTime1() - jogo.getNumGolsTime2();
                        vencedor = jogo.getNomeTime1();
        } else if (jogo.getNumGolsTime2() > jogo.getNumGolsTime1()) {
            resultado = "==== PLACAR DO JOGO ===="+
                        jogo.getNomeTime2() + "(" + jogo.getNumGolsTime2() + ")\n"+
                        "      X\n" +
                        jogo.getNomeTime1() + "(" + jogo.getNumGolsTime1() + ")";
                        
                        diferencaVencedor =  jogo.getNumGolsTime2() - jogo.getNumGolsTime1();
                        vencedor = jogo.getNomeTime2();
        } else {
            resultado = "O jogo terminou em EMPATE!";
            diferencaVencedor =  0;
            vencedor = "EMPATE";
        }

        JOptionPane.showMessageDialog(null, resultado);

        if (vencedor != "EMPATE"){
            JOptionPane.showMessageDialog(null, "Resumo do jogo: O time "  + vencedor + " ganhou com " + diferencaVencedor + " Gol(s) de vantagem");
        } if (vencedor == "EMPATE"){
            JOptionPane.showMessageDialog(null, resultado);
        } if (vencedor == null){
            JOptionPane.showMessageDialog(null, "JOGO INVÁLIDO");
        }
  
        
    }
}
