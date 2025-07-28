package acesso.aluno;

public class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibir() {
        System.out.println("O "+nome+" com "+idade+" anos, sua matrícula é "+matricula);
    }


    
}
