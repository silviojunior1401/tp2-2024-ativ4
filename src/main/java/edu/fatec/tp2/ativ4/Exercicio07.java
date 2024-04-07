/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();
        novoRetangulo.setLado1(10);
        novoRetangulo.setLado2(5);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        novoRetangulo.setLado2(7);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        for (int i = 0; i < 5; i++) {
            Retangulo retangulo = new Retangulo();
            retangulo.setLado1(10 + i);
            retangulo.setLado2(5 + i);
            retangulo.calcularArea();
            retangulo.calcularPerimetro();
        }
    }
}
