package construtores;

public class pessoa {
    String nome;
    int idade;
    
    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é "+nome+" e tenho "+idade+" anos.");
    }
}
