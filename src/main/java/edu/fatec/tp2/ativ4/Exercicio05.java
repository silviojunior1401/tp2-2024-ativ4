/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio05 {

    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        jogadores.add(new Jogador(1, "Jogador Feliz", "Apelido Feliz", new Date(), 1, "Goleiro", 90, 0, false));
        jogadores.add(new Jogador(2, "Jogador Triste", "Apelido Triste", new Date(), 2, "Zagueiro", 85, 0, false));
        jogadores.add(new Jogador(3, "Fulano", "Apelido do Fulano", new Date(), 3, "Zagueiro", 88, 0, false));
        jogadores.add(new Jogador(4, "Felisbino", "Bino", new Date(), 4, "Lateral Direito", 92, 0, false));
        jogadores.add(new Jogador(5, "Jogador da Barra", "Barroso", new Date(), 5, "Lateral Esquerdo", 87, 0, false));
        jogadores.add(new Jogador(6, "Jogador da Zona", "Zonildo", new Date(), 6, "Meia", 89, 0, false));
        jogadores.add(new Jogador(7, "Jucilei", "Juci", new Date(), 7, "Meia", 91, 0, false));
        jogadores.add(new Jogador(8, "Jogador Legal", "Legalzudo", new Date(), 8, "Meia", 86, 0, false));
        jogadores.add(new Jogador(9, "Jogador não muito legal", "Chatão", new Date(), 9, "Centroavante", 93, 0, false));
        jogadores.add(new Jogador(10, "Jogador Devedor", "Serasa", new Date(), 10, "Atacante", 90, 0, false));
        jogadores.add(new Jogador(11, "José da Silva", "Zé", new Date(), 11, "Atacante", 88, 0, false));

        System.out.println("JOGADORES CADASTRADOS");
        for (Jogador jogador : jogadores) {
            String posicao = jogador.getPosicao();
            int numero = jogador.getNumero();
            String nome = jogador.getNome();
            String apelido = jogador.getApelido();
            Date dataNascimento = jogador.getDataNascimento();
            String condicao = jogador.verificarCondicaoDeJogo() ? "TÁ PRA JOGO" : "SUSPENSO";

            System.out.println(String.format("%s: %d - %s (%s) - %td/%tm/%tY CONDIÇÃO: %s", posicao, numero, nome, apelido, dataNascimento, dataNascimento, dataNascimento, condicao));
        }
    }
}
