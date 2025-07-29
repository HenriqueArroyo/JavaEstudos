package hep.exercicio3;

public class ContaCorrente extends ContaBancaria {
    private double taxa = 6.00;


    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor){
    super.depositar(valor);
    if (valor > 0) {
       System.out.println("Depósito efetuado com sucesso!!");
    } else {
        System.out.println("Valor inválido!!");
    }
    }

    @Override
    public void sacar(double valor){
        double valorTotal = valor + taxa;
        if (valorTotal <= getSaldo()&& valorTotal > 0) {
            super.sacar(valorTotal);
            System.out.println("Saque aprovado!!");
        } 
    }





}
