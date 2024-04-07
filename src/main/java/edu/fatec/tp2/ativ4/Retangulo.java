/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ4;

/**
 *
 * @author Silvio Junior
 */
public class Retangulo {

    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public Retangulo() {
    }

    public Retangulo(float lado1, float lado2, float area, float perimetro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getLado1() {
        return this.lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return this.lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getArea() {
        return this.area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public void calcularArea() {
        this.area = this.lado1 * this.lado2;
        System.out.println("Área: " + this.area);
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * this.lado1 + 2 * this.lado2;
        System.out.println("Perímetro: " + this.perimetro);
    }
}
