package construtores;

public class carro {
    String modelo;
    int ano;
    Double velocidadeAtual;

    public carro(String modelo, int ano, Double velocidadeAtual) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("A velocidade do carro foi para "+velocidadeAtual+"km/h.");
    }

    public void frear() {
        if (velocidadeAtual<=0) {
            System.out.println("Carro já se encontra parado");
        } else {
            velocidadeAtual -= 10;
            System.out.println("A velocidade do carro foi para "+velocidadeAtual+"km/h.");
        }
    }

    public void status() {
        System.out.println("O "+modelo+" do ano "+ano+", está a "+velocidadeAtual+"km/h.");
    }
}
