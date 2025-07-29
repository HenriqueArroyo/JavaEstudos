package hep.exercicio1;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void exibirDetalhes() {
        super.exibirDados();
        System.out.println("Linguagem: "+linguagem);
    }
}
