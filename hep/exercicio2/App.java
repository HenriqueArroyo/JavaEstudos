package hep.exercicio2;

public class App {
    public static void main(String[] args) {
        Circulo cir1 = new Circulo(2.15);
        Triangulo tri1 = new Triangulo(5, 7);
        Retangulo ret1 = new Retangulo(2, 5);

        cir1.calcularArea();
        tri1.calcularArea();
        ret1.calcularArea();
    }
}
