// Exercício: Membros Estáticos - Conversor de Moedas
// Objetivo: Calcular a conversão de dólar para real aplicando a taxa de IOF via método e constante estáticos.

package util;

public class CurrencyConverter {
    
    public static final double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        return (amount * dollarPrice) * (1.0 + IOF);
    }
}
