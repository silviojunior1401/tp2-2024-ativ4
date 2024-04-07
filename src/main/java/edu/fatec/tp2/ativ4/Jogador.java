/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Silvio Junior
 */
public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private Boolean suspenso;

    public Jogador() {
    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero,
                   String posicao, int qualidade, int cartoes, Boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao; 
        this.qualidade = qualidade; 
        this.cartoes = cartoes; 
        this.suspenso = suspenso; 
     }

     public boolean verificarCondicaoDeJogo() {
         return !this.suspenso && this.cartoes < 3;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public Boolean getSuspenso() {
        return suspenso;
    }

    public void setSuspenso(Boolean suspenso) {
        this.suspenso = suspenso;
    }
    
    public void aplicarCartao(int quantidade) {
        this.cartoes += quantidade;
        if (this.cartoes >= 3) {
            this.suspenso = true;
        }
    }

    public void cumprirSuspencao() {
        this.cartoes = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        Random random = new Random();
        int probabilidade = random.nextInt(100);
        int decrementoQualidade;

        if (probabilidade < 5) {
            decrementoQualidade = (int) (this.qualidade * 0.15);
        } else if (probabilidade < 15) {
            decrementoQualidade = (int) (this.qualidade * 0.10);
        } else if (probabilidade < 30) {
            decrementoQualidade = (int) (this.qualidade * 0.05);
        } else if (probabilidade < 70) {
            decrementoQualidade = 2;
        } else {
            decrementoQualidade = 1;
        }

        this.qualidade = Math.max(this.qualidade - decrementoQualidade, 0);
    }
     
}
