package hep.exercicio1;

public class Gerente extends Funcionario {
    private String empresa;

    public Gerente(String nome, double salario, String empresa) {
    super(nome, salario);
    this.empresa = empresa;
    }

   @Override 
   public void exibirDados() {
    super.exibirDados();
    System.out.println("Empresa: "+empresa);
   }


}
