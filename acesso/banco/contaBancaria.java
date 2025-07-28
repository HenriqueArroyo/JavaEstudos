package acesso.banco;

import java.util.Scanner;

public class contaBancaria {
    Scanner sc = new Scanner(System.in);
    private double saldo;
    double adicionarSaldo, sacarSaldo;

    void depositar() {
        System.out.println("Quanto quer adicionar ao saldo?");
        adicionarSaldo = sc.nextDouble();

        saldo += adicionarSaldo;
        System.out.println("O saldo adicionado foi de "+adicionarSaldo+" reais.");
    }

    void sacar() {
        System.out.println("Quanto quer sacar do saldo?");
        sacarSaldo = sc.nextDouble();

        if (sacarSaldo>saldo) {
            System.out.println("Valor de Saque maior que saldo disponível!");
        } else {
            saldo -= sacarSaldo;
            System.out.println("O saldo sacado foi de "+sacarSaldo+" reais.");
        } 
    }

    void exibirSaldo() {
        System.out.println(saldo);
    }

    public contaBancaria(double saldo) {
        this.saldo = saldo;
    }

}
