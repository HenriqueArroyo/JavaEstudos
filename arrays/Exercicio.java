package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int[] numeros = new int[5];
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;
        numeros[4] = 10;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void exercicio2() {
        double resultado = 0;
        int[] numeros = new int[5];
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;
        numeros[4] = 10;

        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        System.out.println(resultado);
    }

    public void exercicio3() {
        int[] numeros = {2, 4, 6, 30 , 8, 10, 12};
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i : numeros) {
            if (i>maior) {
                maior = i;
            }

            if (i<menor) {
                menor = i;
            }
        }

        System.out.println(" O maior número é "+maior);
        System.out.println("O menor número é "+menor);
       
    }

    public void exercicio4() {
        int[] numeros = {2, 5, 7, 30 , 8, 10, 12};
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
         if (numeros[i]%2==0) {
            pares ++;
         }   
        }

        System.out.println(pares);
    }

    public void exercicio5() {
    String[] nomes = new String[5];

    for (int i = 0; i < nomes.length; i++) {
        System.out.println("Adicione um nome: ");
        nomes[i] = sc.nextLine();
    }

    System.out.println("Procure um nome: ");
    String escolha = sc.nextLine();

    for ( String i : nomes) {
        if (i.equals(escolha)) {
            System.out.println(i);
        }
    }
    }

    public void exercicio6() {
        ArrayList<String> nomes = new ArrayList<>();
        boolean condicao = true;
        String nomesEntrada;

        while (condicao) {
        System.out.println("Adicione nomes para a lista");
        nomesEntrada = sc.nextLine();

        if (nomesEntrada.equals("fim") ) {
            System.out.println("Quantidade de nomes adicionados: "+nomes.size());
            condicao = false;
        } else {
            nomes.add(nomesEntrada);
        }
        }
    }

    public void exercicio7() {
        ArrayList<Double> notas = new ArrayList<>();
        boolean condicao = true;
        double notasEntrada;

        while (condicao) {
            System.out.println("Adicione notas: ");
            notasEntrada = sc.nextDouble();

            if (notasEntrada<0) {
                double soma = 0;
                for (double num : notas) {
                  soma += num;
                }
                double media = soma/notas.size();

                System.out.println("A média é "+media);

                for (int i = 0; i < notas.size(); i++) {
                    System.out.println(notas.get(i));
                }   
                
            
                condicao = false;
            } else{
                notas.add(notasEntrada);
            }

        }
    }

    public void exercicio8() {
        ArrayList<Integer> num = new ArrayList<>();
        int numEntrada;
        int numRemover;
        boolean condicao = true;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro: ");
            numEntrada = sc.nextInt();

            num.add(numEntrada);
        }

        while (condicao) {
            for (Integer integer : num) {
                System.out.println(integer);
            }
            System.out.println("Qual número quer remover?");
            numRemover = sc.nextInt();       
             if (num.contains(numRemover)) {
                num.remove(Integer.valueOf(numRemover));
                System.out.println("O número "+numRemover+" foi removido!");
             } else {
                System.out.println("Número não foi encontrado!");
             }
            
        }
    }


    public void exercicio9() {
        ArrayList<String> nomes = new ArrayList<>();
        String nomesEntrada, palavraProcurada;
        boolean condicao= true;
        boolean condicao2 = true;

        while (condicao) {
            System.out.println("Adicione palavras a lista: ");
            nomesEntrada = sc.nextLine();

            if (nomesEntrada.equals("fim")) {
                System.out.println("Fim do cadastro");
                condicao = false;
            } else {
                nomes.add(nomesEntrada);
            }

        }

        while (condicao2) {
            int contador = 0;
            System.out.println("Pesquise quantas vezes a palavra aparece: ");
            palavraProcurada = sc.nextLine();
    
            if (nomes.contains(palavraProcurada)) {
                for (String string : nomes) {
                    if (string.equals(palavraProcurada)) {
                        contador ++;
                    }
                }
                System.out.println("A palavra "+palavraProcurada+" foi encontrada "+contador+" vezes.");
            } else if (palavraProcurada.equals("fim")) {
                condicao2 = false;
            } else {
                System.out.println("Palavra não está na lista");
            }
    
        }
    }

    public void exercicio10() {
        ArrayList<String> product = new ArrayList<>();
        boolean condition = true;
        String searchedProduct, newName;

        product.add("Coca cola");
        product.add("Pepsi");
        product.add("Sprite");
        product.add("Fanta");
        product.add("Guaraná");

        while (condition) {
            for (String list1 : product) {
                System.out.println("- "+list1);
            }
            System.out.println("Digite um produto para atualizar!\n Produto: ");
            searchedProduct = sc.nextLine();

            if (product.contains(searchedProduct)) {
                System.out.println("Encontrado!!\n Escolha um novo nome: ");
                newName = sc.nextLine();
            
                for (int i = 0; i < product.size(); i++) {
                    if (product.get(i).equals(searchedProduct)) {
                        product.set(i, newName);
                        System.out.println("Nome atualizado");
                    }
                }
            } else if (searchedProduct.equals("fim")) {
                condition = false;
            } else {
                System.out.println("Produto não encontrado!!");
            }

        }

    }



}
