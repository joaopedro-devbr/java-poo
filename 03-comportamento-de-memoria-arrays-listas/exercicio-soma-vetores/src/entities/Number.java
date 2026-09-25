// Exercício: Soma Vetores - Vetores de Objetos
// Objetivo: Entidade de domínio para armazenar um valor inteiro e fornecer a operação de soma entre instâncias.

package entities;

public class Number {
    
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public Number sum(Number other) {
        return new Number(this.value + other.getValue());
    }
}
