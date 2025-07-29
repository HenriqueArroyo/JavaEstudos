package hep.exercicio1;

public class App {
    public static void main(String[] args) {
        Gerente ger = new Gerente("Henrique", 5000, "Nubank");
        Desenvolvedor des = new Desenvolvedor("Douglas", 15000, "C#");

        ger.exibirDados();
        des.exibirDados();
    }
}
