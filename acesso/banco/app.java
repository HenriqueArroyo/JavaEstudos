package acesso.banco;

import java.util.Scanner;

class app {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    contaBancaria bank1 = new contaBancaria(1000.00);
    boolean condicao = true;

    while (condicao) {
        System.out.println("------ Conta Bancária -------\n1 - Exibir Saldo\n2 - Depositar saldo\n3 - Sacar saldo\n4 - Sair");
        int operador = sc.nextInt();
        switch (operador) {
            case 1:
                bank1.exibirSaldo();
                break;
                case 2:
                bank1.depositar();
                break;
                case 3:
                bank1.sacar();
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