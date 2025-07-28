package hep.exercicio2;

public class Triangulo extends Forma {
    int base, altura;

    public Triangulo(int base, int altura) {
        double media = (base*altura) /2;
        System.out.println(media);
    }
}
