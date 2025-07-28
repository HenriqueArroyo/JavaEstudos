package construtores;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pessoa pes1 = new pessoa("Douglas", 15);
        // pes1.apresentar();

        // produto pro1 = new produto("Coca-Cola", 5.99, 20);
        // pro1.exibirDetalhes();
        boolean condicao = true;
        carro car1 = new carro("Celta", 2008, 50.00);
   
        while (condicao) {
            System.out.println("-------Menu------\n1 - Exibir Status do carro\n2 - Acelerar\n3 - Frear\n4 - Sair");
            int operador = sc.nextInt();

            switch (operador) {
                case 1:
                    car1.status();
                    break;
                case 2:
                    car1.acelerar();
                    break;
                case 3:
                    car1.frear();
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
