/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
class Importado extends Nacional {
    private double taxaImportacao;

    public Importado(String descricao, double valor, double taxa, double taxaImportacao) {
        super(descricao, valor, taxa);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + (super.valor * this.taxaImportacao);
    }
}
