package hep.exercicio5;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: "+autor);
    }


}
