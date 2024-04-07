/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
public abstract class Produto {
    protected String descricao;
    protected double valor;
    protected double imposto;

    public Produto(String descricao, double valor, double imposto) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }

    public abstract double calcularValorFinal();

    public void relatorio() {
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Imposto: " + this.imposto);
        System.out.println("Valor Final: " + this.calcularValorFinal());
    }
}
