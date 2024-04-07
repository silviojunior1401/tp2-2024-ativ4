/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio04 {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar Produto Estadual");
            System.out.println("2 - Cadastrar Produto Nacional");
            System.out.println("3 - Cadastrar Produto Importado");
            System.out.println("4 - Exibir Produtos Estaduais");
            System.out.println("5 - Exibir Produtos Nacionais");
            System.out.println("6 - Exibir Produtos Importados");
            System.out.println("7 - Exibir Todos Produtos");
            System.out.println("9 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a descrição do produto: ");
                    String descricao = scanner.next();
                    System.out.print("Digite o valor do produto: ");
                    double valor = scanner.nextDouble();
                    Produto estadual = new Estadual(descricao, valor);
                    produtos.add(estadual);
                }
                case 2 -> {
                    System.out.print("Digite a descrição do produto: ");
                    String descricao = scanner.next();
                    System.out.print("Digite o valor do produto: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Digite a taxa do produto: ");
                    double taxa = scanner.nextDouble();
                    Produto nacional = new Nacional(descricao, valor, taxa);
                    produtos.add(nacional);
                }
                case 3 -> {
                    System.out.print("Digite a descrição do produto: ");
                    String descricao = scanner.next();
                    System.out.print("Digite o valor do produto: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Digite a taxa do produto: ");
                    double taxa = scanner.nextDouble();
                    System.out.print("Digite a taxa de importação do produto: ");
                    double taxaImportacao = scanner.nextDouble();
                    Produto importado = new Importado(descricao, valor, taxa, taxaImportacao);
                    produtos.add(importado);
                }
                case 4 -> {
                    for (Produto produto : produtos) {
                        if (produto instanceof Estadual) {
                            produto.relatorio();
                        }
                    }
                }
                case 5 -> {
                    for (Produto produto : produtos) {
                        if (produto instanceof Nacional && !(produto instanceof Importado)) {
                            produto.relatorio();
                        }
                    }
                }
                case 6 -> {
                    for (Produto produto : produtos) {
                        if (produto instanceof Importado) {
                            produto.relatorio();
                        }
                    }
                }
                case 7 -> {
                    for (Produto produto : produtos) {
                        produto.relatorio();
                    }
                }
            }

        } while (opcao != 9);

        scanner.close();
    }
}
