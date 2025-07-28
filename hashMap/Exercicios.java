package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        HashMap<String, Integer> student = new HashMap<>();
        String name, searchedName;
        int grade;
        boolean condition = true;

        for (int i = 0; i < 5; i++) {
            sc.nextLine(); // limpa o buffer
            System.out.println("Me informe o nome do aluno");
            name = sc.nextLine();
            System.out.println("Agora me informe a nota");
            grade = sc.nextInt();

            student.put(name, grade);
        }

        while (condition) {
            int operador;

            System.out.println("1- Mostrar todos alunos e notas\n2 - Pesquisar um aluno");
            operador = sc.nextInt();

            switch (operador) {
                case 1:
                    for (String key : student.keySet()) {
                        System.out.println(key + ", tem a nota de " + student.get(key));
                    }
                    break;
                case 2:
                    sc.nextLine(); // limpa o buffer
                    System.out.println("Qual é o nome do aluno procurado? ");
                    searchedName = sc.nextLine();
                    if (student.containsKey(searchedName)) {
                        System.out.println("O aluno " + searchedName + ", tem a nota de " + student.get(searchedName));
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 3:
                    condition = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void exercicio2() {
        HashMap<String, Integer> product = new HashMap<>();
        boolean condition = true;
        String name, searchedProduct;
        int number, newNumber;

        while (condition) {
            System.out.println(
                    "---------- Estoque -----------\n1 - Adicionar Produtos\n2 - Atualizar quantidade\n3 - Procurar produto\n4 - Listar Produtos");
            int operator = sc.nextInt();

            switch (operator) {
                case 1:
                    sc.nextLine(); // limpa o buffer
                    System.out.println("Informe o nome do produto:");
                    name = sc.nextLine();
                    System.out.println("Me informe a quantidade do estoque:");
                    number = sc.nextInt();

                    product.put(name, number); // <-- faltou adicionar esta linha
                    System.out.println("Produto adicionado!!");
                    break;
                case 2:
                    sc.nextLine(); // limpa o buffer
                    System.out.println("Me informe o nome do produto: ");
                    searchedProduct = sc.nextLine();

                    if (product.containsKey(searchedProduct)) {
                        System.out.println("Qual a quantidade de estoque?");
                        newNumber = sc.nextInt();
                        product.put(searchedProduct, newNumber);
                        System.out.println("Quantidade atualizada! \n");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 3:
                    sc.nextLine(); // limpa o buffer
                    System.out.println("Me informe o nome do produto procurado: ");
                    searchedProduct = sc.nextLine();

                    System.out.println("--------Quantidade----------");

                    if (product.containsKey(searchedProduct)) {
                        System.out.println(product.get(searchedProduct));

                    }
                    System.out.println("-----------------------------------\n");

                    break;

                case 4:
                    System.out.println("--------Lista de Produtos----------\n");
                    for (String key : product.keySet()) {
                        System.out.println(key);
                    }
                    System.out.println("\n -----------------------------------\n");

                    break;

                default:
                    break;
            }
        }
    }

    public void Exercicio3() {
        HashMap<String, String> contact = new HashMap<>();
        String name, number, removeNumber, searchedName, numCerto;
        boolean condition = true;
        int operator;

        while (condition) {
            System.out.println(
                    "------------ Agenda de Contatos ------------\n1 - Adicionar um contato\n2 - Procurar na Lista\n3 - Remover um contato\n4 - Listar todos os contatos");
            operator = sc.nextInt();

            switch (operator) {
                case 1:
                    sc.nextLine();
                    System.out.println("Qual é o nome do contato?");
                    name = sc.nextLine();
                    System.out.println("Me informe o número!");
                    number = sc.nextLine();

                    contact.put(name, number);
                    System.out.println("Contato adicionado com sucesso!!\n");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Qual o nome do contato quer procurar?");
                    searchedName = sc.nextLine();

                    if (contact.containsKey(searchedName)) {
                        System.out.println(contact.get(searchedName));
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Me informe o número do contato que deseja remover!");
                    removeNumber = sc.nextLine();

                    boolean encontrado = false;

                    for (Map.Entry<String, String> entry : contact.entrySet()) {
                        if (entry.getValue().equals(removeNumber)) {
                            contact.remove(entry.getKey());
                            System.out.println("Contato removido com sucesso!!");
                            encontrado = true;
                            break; // importante evitar ConcurrentModificationException
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado!!");
                    }
                    break;
                case 4:
                    System.out.println("-------Agenda------");
                    for (String key : contact.keySet()) {
                        System.out.println(key+" - "+contact.get(key));
                    }
                    System.out.println("-------------------\n");
                    break;

                default:
                    break;
            }

        }
    }


    public void Exercicio4() {
        HashMap<String, Integer> contador = new HashMap<>();

        System.out.println("Escreva uma frase: ");
        String frase = sc.nextLine().toLowerCase();

        String[] palavras = frase.replaceAll("[^a-zA-Zà-úÀ-Ú0-9 ]", "").split("\\s+");

        for (String palavra : palavras) {
            if (contador.containsKey(palavra)) {
                contador.put(palavra, contador.get(palavra) + 1);
            } else{
                contador.put(palavra, 1);
            }
    
        } 

        System.out.println("Contador: ");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        sc.close();
    }

    public void Exercicio5() {
        HashMap<String, String> traducao = new HashMap<>();
        String palavra, word, searchedPalavra;
        boolean condicao = true;

        traducao.put("cachorro", "dog");
        traducao.put("gato", "cat");
        traducao.put("gostar", "like");
        traducao.put("sim", "yes");
        traducao.put("não", "no");
        traducao.put("mesa", "table");
        traducao.put("livro", "book");
        traducao.put("maçã", "apple");
        traducao.put("banana", "banana");
        traducao.put("gol", "goal");
        traducao.put("criar", "make");
        traducao.put("comer", "eat");
        traducao.put("dormir", "sleep");


        while (condicao) {
       System.out.println("----- Dicionário -----\n1 - Pesquisar palavras\n2 - Listar traduções");
       int operador = sc.nextInt();
        switch (operador) {
            case 1:
            sc.nextLine();
            System.out.println("Me informe a palavra: ");
            searchedPalavra = sc.nextLine();

            for (String key : traducao.keySet()) {
                if (key.equals(searchedPalavra)) {
                    System.out.println("A tradução de "+searchedPalavra +" é "+traducao.get(key));
                }
            }
            break;
            case 2:
            for (Map.Entry<String, String> entry : traducao.entrySet()) {
                System.out.println(entry);
            }
            default:
                break;
        }
        }

    }
}
