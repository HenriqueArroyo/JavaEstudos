package hep.exercicio2;

public class Circulo extends Forma {
   double raio;
   
   public Circulo(double raio) {
    double pi = 3.14;
    double mul = (raio*pi);
    double area = mul*mul;
    System.out.println(area);
   }
}
