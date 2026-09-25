// Exercício: Números Pares - Vetores de Objetos
// Objetivo: Entidade de domínio para armazenar um valor inteiro e validar se ele é par.

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

    public boolean isEven() {
        return value % 2 == 0;
    }
}
