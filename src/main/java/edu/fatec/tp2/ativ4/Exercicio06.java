/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fulano", "1234", 3000.0, Date.from(Instant.now()), "123.456.789-00");

        funcionario.receberAumento(500.0);
        System.out.println("Salário após aumento: " + funcionario.getSalario());

        double ganhoBrutoAnual = funcionario.calcularGanhoBrutoAnual();
        System.out.println("Ganho bruto anual: " + ganhoBrutoAnual);

        double imposto = funcionario.calcularImposto();
        System.out.println("Imposto anual: " + imposto);

        double ganhoLiquidoMensal = funcionario.calcularGanhoLiquidoMensal();
        System.out.println("Ganho líquido mensal: " + ganhoLiquidoMensal);

        double ganhoLiquidoAnual = funcionario.calcularGanhoLiquidoAnual();
        System.out.println("Ganho líquido anual: " + ganhoLiquidoAnual);
    }
}
