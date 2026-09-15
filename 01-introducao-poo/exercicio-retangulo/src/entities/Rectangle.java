// Exercício: Retângulo - Introdução à POO
// Objetivo: Implementar a classe Rectangle com atributos e métodos para calcular área, perímetro e diagonal.

package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
