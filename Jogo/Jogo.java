package Jogo;

public class Jogo {
    private String nomeTime1;
    private String nomeTime2;
    private int numGolsTime1;
    private int numGolsTime2;

    public Jogo(String nomeTime1, String nomeTime2, int numGolsTime1, int numGolsTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }

    public String getNomeTime1() {
        return nomeTime1;
    }

    public void setNomeTime1(String nomeTime1) {
        this.nomeTime1 = nomeTime1;
    }

    public String getNomeTime2() {
        return nomeTime2;
    }

    public void setNomeTime2(String nomeTime2) {
        this.nomeTime2 = nomeTime2;
    }

    public int getNumGolsTime1() {
        return numGolsTime1;
    }

    public void setNumGolsTime1(int numGolsTime1) {
        this.numGolsTime1 = numGolsTime1;
    }

    public int getNumGolsTime2() {
        return numGolsTime2;
    }

    public void setNumGolsTime2(int numGolsTime2) {
        this.numGolsTime2 = numGolsTime2;
    }

}
