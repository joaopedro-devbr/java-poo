// Exercício: Maior Posição - Vetores de Objetos
// Objetivo: Entidade de domínio para armazenar um valor do tipo real (double).

package entities;

public class RealNumber {
    
    private double value;

    public RealNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
