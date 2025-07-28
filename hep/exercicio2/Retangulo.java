package hep.exercicio2;

public class Retangulo extends Forma {
   int lado1, lado2;

   public Retangulo(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
   }


    @Override
    public void calcularArea() {
        System.out.println(lado1*lado2);
    }
}
