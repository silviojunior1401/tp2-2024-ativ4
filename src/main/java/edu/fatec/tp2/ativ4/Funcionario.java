/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

import java.util.Date;

/**
 *
 * @author Silvio Junior
 */
public class Funcionario {

    private String nome;
    private String matricula;
    private double salario;
    private Date dataAdmissao;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(String nome, String matricula, double salario, Date dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    public double calcularGanhoBrutoAnual() {
        return this.salario * 13;
    }

    public double calcularImposto() {
        double inss = this.salario * 0.11;
        double ir = this.salario > 2500 ? (this.salario - 2500) * 0.175 : 0;
        return (inss + ir) * 13;
    }

    public double calcularGanhoLiquidoMensal() {
        double inss = this.salario * 0.11;
        double ir = this.salario > 2500 ? (this.salario - 2500) * 0.175 : 0;
        return this.salario - inss - ir;
    }

    public double calcularGanhoLiquidoAnual() {
        return this.calcularGanhoBrutoAnual() - this.calcularImposto();
    }
}
