package hep.exercicio5;

public class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Marca: "+marca);
    }
}
