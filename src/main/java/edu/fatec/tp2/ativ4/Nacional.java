/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
class Nacional extends Produto {

    private double taxa;

    public Nacional(String descricao, double valor, double taxa) {
        super(descricao, valor, 0.10);
        this.taxa = taxa;
    }

    @Override
    public double calcularValorFinal() {
        return super.valor + (super.valor * super.imposto) + (super.valor * this.taxa);
    }
}
