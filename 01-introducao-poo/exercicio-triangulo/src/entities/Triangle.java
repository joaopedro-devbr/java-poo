// Exercício: Problema Triângulo - Introdução à POO
// Objetivo: Implementar o método area() dentro da classe Triangle para encapsular o cálculo de Heron.

package entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double area() {
       double p = (a + b + c) / 2.0;
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
