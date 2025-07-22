package metodosParametros;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Exercicios obj = new Exercicios();
    // obj.mensagem("João");
    // obj.dobro(4);
    // obj.ehPar(3);
    // obj.media(10, 15, 20);
    // obj.potencia(2, 4);
    // obj.fatorial(4);
    // obj.ehPrimo(11);
    // obj.saudacao(11);
    // obj.maior(12, 13);
    // obj.calcular(12, 6, '+');

    
    boolean manter = true;
while (manter) {
    System.out.println("\n---- MENU ----\n1 - Mensagem\n2 - dobro\n3 - É par?\n4 - Média!\n5 - Potência\n6 - Fatorial\n7 - É primo?\n8 - Saudação\n9 - Maior\n10 - Calcular\n11 - Sair");
    int escolha = sc.nextInt();
    sc.nextLine(); // consome o \n que ficou no buffer

    switch (escolha) {
        case 1:
            System.out.println("Informe seu nome:");
            String nome = sc.nextLine();
    
            obj.mensagem(nome);
      
            break;
        case 2:
        System.out.println("Qual número inteiro quer dobrar?");
        int dobro = sc.nextInt();
        obj.dobro(dobro);
        break;
        case 3:
        System.out.println("Me informe o número!");
        int par = sc.nextInt();
        obj.ehPar(par);
        break;
        case 4:
        System.out.println("Informe o primeiro número de 3 para ver suas médias!");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número de 3 para ver suas médias!");
        int num2 = sc.nextInt();
        System.out.println("Informe o terceiro número de 3 para ver suas médias!");
        int num3 = sc.nextInt();

        obj.media(num1, num2, num3);

        break;
        case 5:
        System.out.println("Me informe a base: ");
        int base = sc.nextInt();
        System.out.println("Me informe o expoente: ");
        int expoente = sc.nextInt();

        obj.potencia(base, expoente);
        break;
        case 6:
        System.out.println("Me informe o número a ser fatorado: ");
        int fatorar = sc.nextInt();
        obj.fatorial(fatorar);

        break;
        case 7:
        System.out.println("Me informe o número: ");
        int primo = sc.nextInt();

        obj.ehPrimo(primo);

        break;
        case 8:
        System.out.println("Me informe que horas é :");
        int hora = sc.nextInt();

        obj.saudacao(hora);
        break;
        case 9:
        System.out.println("Me informe o primeiro número: ");
        int pnum = sc.nextInt();
        System.out.println("Me informe o segundo número: ");
        int snum = sc.nextInt();

        obj.maior(pnum, snum);

        break;
        case 10:
        System.out.println("Me informe qual operação deseja efetuar(+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("O primeiro número: ");
        int op1 = sc.nextInt();
        System.out.println("O segundo número: ");
        int op2 = sc.nextInt();

        obj.calcular(op1, op2, op);
        break;
        case 11:
        manter = false;
        break;
        default:
        System.out.println("Operador inválido!");
            break;
}
    
    }
    


    }
}
