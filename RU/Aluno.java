package RU;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String campus;

    public Aluno(String nome, String matricula, String curso, String campus){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }
    public String getCampus() { return campus; }

    public String toString() {
        return "=== DADOS DO ALUNO ===" +
               "\nNome: " + nome +
               "\nMatrícula: " + matricula +
               "\nCurso: " + curso +
               "\nCampus: " + campus;
    }
}
