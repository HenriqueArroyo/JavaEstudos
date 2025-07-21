import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicios {
 Scanner sc = new Scanner(System.in);

       public void Exercicio1() {
        System.out.println("Digite um número");
        int num1 = sc.nextInt();

        if (num1%2==0 ) {
            System.out.println(num1+" é Par!!");
        } else {
            System.out.println(num1+" é Impar!!");
        }
       }

       public void Exercicio2() {
        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = sc.nextInt();

        if (num1>num2&&num1>num3) {
            System.out.println("O maior número é o "+num1);
        } else  if (num2>num1&&num2>num3) {
            System.out.println("O maior número é o "+num2);
        } else  if (num3>num2&&num3>num1) {
            System.out.println("O maior número é o "+num3);
        }
       }

     public void Exercicio3() {
        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();
        
        int adicao = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                
                System.out.println("O resultado da adição é "+adicao);
                break;
            case 2:
            System.out.println("O resultado da adição é "+subtracao);
            break;
            case 3:
            System.out.println("O resultado da adição é "+multiplicacao);
            break;
            case 4:
            System.out.println("O resultado da adição é "+divisao);
            break;
            default:
                break;
        }
     }

     public void Exercicio4() {
        System.out.println("Digite um número");
        int num1 = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = num1*i;
            System.out.println(tabuada);
        }
     }

     public void Exercicio5() {
        System.out.println("Digite o número de numeros para somar:");
        int qtd = sc.nextInt();
        boolean condicao = true;
        int soma = 0;


        while (condicao) {
            for (int i = 1; i <= qtd; i++) {
                System.out.println("Digite o "+i+"º número para somar");
                int num = sc.nextInt();

                soma += num;
                if (i==qtd) {
                    System.out.println("A soma total é "+soma);
                    condicao = false;
                    break;
                }
            }
        }


     }

     public void Exercicio6() {
        for (int i = 10; i >= 0; i--) {
            if (i==0) {
                System.out.println("Lançamento!!");
            } else {
                System.out.println(i);
            }
        }
     }

     public void Exercicio7() {
        boolean condicao = true;
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatador);
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(formatoHora);
        
        do {
            System.out.println("1 - Mostrar data\n2 - Mostrar hora\n3 - Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                System.out.println("Data formatada: " + dataFormatada);
                    break;
                case 2:
                System.out.println("Horário atual: " + horaFormatada);
                break;
                case 3:
                condicao = false;
                break;
                default:
                System.out.println("Digite um valor válido.");
                    break;
            }
        } while (condicao);

     }

     public void Exercicio8() {
        boolean condição = true;
        int soma = 0;
        while (condição) {
            System.out.println("Digite um número para soma:\n");
            int num = sc.nextInt();

            soma += num;

            if (num==0) {
            System.out.println("Valor total da soma:"+soma);
            break;
            }
        }
     }

     public void Exercicio9() {
        int soma = 0;
        int validos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Número negativo ignorado.");
                continue;  // pula para o próximo número
            }

            soma += num;
            validos++;
        }

        if (validos > 0) {
            double media = (double) soma / validos;
            System.out.println("Quantidade de números válidos: " + validos);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
     }

     public void Exercicio10() {
        System.out.println("Digite um número");
        int num = sc.nextInt();
        boolean primo = true;

        if (num==1) {
            primo = false;
        } else if (num==2) {
            primo = true;
        } else if (num%2==0) {
        primo = false;
        } else{
        double limite = Math.sqrt(num);
        for (int i = 3; i <= limite; i += 2) {
            if (num%i==0) {
                primo = false;
            }
        }
        }

        if (primo) {
            System.out.println("O número é primo!!");
        } else {
            System.out.println("O número não é primo!!");
        }


     }

}
