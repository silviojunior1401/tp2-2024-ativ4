/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.fatec.tp2.ativ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio03 {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos (somente nome)");
            System.out.println("3 - Relatório Geral (exibe todas as informações)");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o ID do aluno: ");
                    String id = scanner.next();
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.next();
                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite o peso do aluno: ");
                    float peso = scanner.nextFloat();
                    System.out.print("Digite a altura do aluno: ");
                    float altura = scanner.nextFloat();
                    Aluno aluno = new Aluno(id, nome, idade, peso, altura);
                    alunos.add(aluno);
                }
                case 2 -> {
                    for (Aluno a : alunos) {
                        System.out.println(a.getNome());
                    }
                }
                case 3 -> {
                    for (Aluno a : alunos) {
                        a.exibir();
                        System.out.println("IMC: " + a.calcularIMC());
                    }
                }
            }
        } while (opcao != 9);

        scanner.close();

    }
}
