package construtores;

public class produto {
    String nome;
    Double preco;
    int quantidade;

    public produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void exibirDetalhes() {
        System.out.println(nome+"\npreço: "+preco+"\nQuantidade: "+quantidade);
    }






}
