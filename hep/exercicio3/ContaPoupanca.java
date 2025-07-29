package hep.exercicio3;

public class ContaPoupanca extends ContaBancaria {
    
    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

   
    public void aplicarRendimento() {
        double rendimento = getSaldo() * 0.02;
        
        super.depositar(rendimento);
        System.out.println("O rendimento de "+rendimento+" foi aplicado ao saldo da conta!");
    }

    @Override
    public void sacar(double valor){
        super.sacar(valor);
    }




}
