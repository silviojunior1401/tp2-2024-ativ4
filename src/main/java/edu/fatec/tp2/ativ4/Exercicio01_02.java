/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio01_02 {
    /**
     *  01 - Os métodos de objetos estão associados a uma instância de uma classe, 
     * ou seja, a um objeto e operam nos atributos desse objeto em específico.
     * Enquanto os métodos estáticos pertencem a classe em si e são compartilhados
     * entre todas as suas instâncias, não sendo vinculados a um objeto em específico.
     * 
     * 02 - a) Before: 0 After: 1Flap Flap:0
     * Quando a instância de Nightingale é criada, o construtor incrementa 
     * referenceCount em 1. Por isso, “Before: 0 After: 1” é impresso. 
     * Em seguida, o método fly é chamado na instância florence. Como a variável 
     * de instância "a" não foi inicializada, ela tem o valor padrão, que é 0. 
     * Por isso, “Flap Flap:0” é impresso.
     * b) Será criada uma instância da variável referenceCount e 15 instâncias 
     * da variável a.
     * A variável referenceCount é uma variável static, o que significa que 
     * ela é compartilhada por todas as instâncias. Por outro lado, a é uma 
     * variável de instância, o que significa que cada instância de Bird ou 
     * Nightingale terá sua própria cópia de a.
     */
}
