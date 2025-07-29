package hep.exercicio3;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContaPoupanca cor1 = new ContaPoupanca("Henrique", 1200);
    boolean condicao = true;

    // while (condicao) {
    //     System.out.println("------ Conta Corrente ------\n1 - ver Saldo\n2 - Depositar\n3 - Sacar\n4 - Sair");
    //     int operador = sc.nextInt();

    //     switch (operador) {
    //         case 1:
    //         System.out.println("O saldo está em "+cor1.getSaldo());
    //             break;
    //         case 2:
    //         System.out.println("Quanto deseja depositar?");
    //         double deposito = sc.nextDouble();

    //         cor1.depositar(deposito);
    //             break;
    //         case 3:
    //         System.out.println("Quanto deseja sacar?");
    //         double sacar = sc.nextDouble();

    //         cor1.sacar(sacar);
    //             break;
    //          case 4:
    //         condicao = false;
    //                         break;
    //         default:
    //             break;
    //     }
    // }

    while (condicao) {
        System.out.println("------ Conta Poupança ------\n1 - ver Saldo\n2 - Aplicar rendimento\n3 - Sacar\n4 - Sair");
        int operador = sc.nextInt();

        switch (operador) {
            case 1:
            System.out.println("O saldo está em "+cor1.getSaldo());
                break;
            case 2:
            cor1.aplicarRendimento();

                break;
            case 3:
            System.out.println("Quanto deseja sacar?");
            double sacar = sc.nextDouble();

            cor1.sacar(sacar);
                break;
             case 4:
            condicao = false;
                            break;
            default:
                break;
        }
    }




}
    
}