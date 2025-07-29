package hep.exercicio3;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0&&valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque reprovado!!");
        }
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    
}
