/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
class Estadual extends Produto {

    public Estadual(String descricao, double valor) {
        super(descricao, valor, 0.10);
    }

    @Override
    public double calcularValorFinal() {
        return super.valor + (super.valor * super.imposto);
    }
}
