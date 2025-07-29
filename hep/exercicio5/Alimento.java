package hep.exercicio5;

public class Alimento extends Produto {
    private String validade;

    public Alimento(String nome, double preco, String validade){
        super(nome, preco);
        this.validade = validade;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Validade:");
    }
}
