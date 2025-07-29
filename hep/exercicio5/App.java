package hep.exercicio5;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 49.99, "J. K. Rowling");
        Eletronico eletronico = new Eletronico("A05S", 899.99, "Samsung");
        Alimento alimento = new Alimento("Leite Integral", 5.99, "3 meses");

        livro.exibirDetalhes();
        eletronico.exibirDetalhes();
        alimento.exibirDetalhes();

    }
}
