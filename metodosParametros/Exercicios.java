package metodosParametros;

public class Exercicios {
    // Exercício 1
    public void mensagem(String nome) {
        System.out.println("Olá, "+nome+"! Seja bem-vindo!");
    }

    // Exercício 2
    public void dobro(double num) {
    System.out.println("O dobro de "+num+" é "+num*2);
    }

    // Exercício 3
    public void ehPar(int n) {
        if (n%2==0) {
            System.out.println(" O número "+n+" é Par!");
        } else {
            System.out.println(" O número "+n+" é Impar!");
        }
    }

    // Exercício 4
    public void media(double a, double b, double c) {
        double soma = (a+b+c)/3;
        System.out.println("A média dos 3 números é "+soma);
    }

    // Exercício 5
    public void potencia(int base, int expoente) {
     double resultado = Math.pow(base, expoente);
     System.out.println(resultado);
    }

    


}
