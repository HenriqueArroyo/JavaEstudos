package metodosParametros;

public class Exercicios {
    // Exercício 1
    public void mensagem(String nome) {
        System.out.println("Olá, "+nome+"! Seja bem-vindo!");
    }

    // Exercício 2
    public void dobro(double num) {
    System.out.println("O dobro de "+num+" é "+num*2);
    }

    // Exercício 3
    public void ehPar(int n) {
        if (n%2==0) {
            System.out.println(" O número "+n+" é Par!");
        } else {
            System.out.println(" O número "+n+" é Impar!");
        }
    }

    // Exercício 4
    public void media(double a, double b, double c) {
        double soma = (a+b+c)/3;
        System.out.println("A média dos 3 números é "+soma);
    }

    // Exercício 5
    public void potencia(int base, int expoente) {
     double resultado = Math.pow(base, expoente);
     System.out.println(resultado);
    }

    // Exercício 6
    public void fatorial(int n) {
        double resultado = 1;
        for (int i = n; i >= 1; i --) {
            resultado = resultado*i;
        }

        System.out.println(resultado);
    };

    // Exercício 7
    public void ehPrimo(int n) {
        boolean primo = true;

        if (n==1) {
            primo = false;
        }  else if (n==2) {
            primo = true;
        } else {
            double limite = Math.sqrt(n);
            for (int i = 1; i <= n; i++) {
                if (n%2==0) {
                    primo = false;
                } 
            }
        }
       System.out.println(primo);
    }

        // Exercício 8
    public void saudacao(int hora) {
        if (hora>5&&hora<12) {
            System.out.println("Bom dia");
        } else if (hora>11&&hora<18) {
            System.out.println("Boa tarde");
        } else if (hora>17&&hora<24) {
            System.out.println("Boa noite");
        } else if (hora>=0&&hora<6) {
            System.out.println("Boa noite");
        } else {
            System.out.println("O número não está entre 0 - 24");
        }
            
        }
    // Exercício 9
    public void maior(int a, int b) {
        if (a>b) {
            System.out.println("O número "+a+" é maior que "+b);
        } else if (b>a) {
            System.out.println("O número "+b+" é maior que "+a);
        } else {
            System.out.println("Os numeros"+a+" e "+b + " são iguais ");
        }
    }

    // Exercício 10
    public void calcular(double a, double b, char operador) {
        double adicao = a +b;
        double subtracao = a-b;
        double multiplicacao = a*b;
        double divisao = a/b;
        switch (operador) {
            case '+':
                System.out.println(adicao);
                break;
                case '-':
                System.out.println(subtracao);
                break;
                case '*':
                System.out.println(multiplicacao);
                break;
                case '/':
                System.out.println(divisao);
                break;
            default:
            System.out.println("Operador Inválido");
                break;
        }
    }


    }




