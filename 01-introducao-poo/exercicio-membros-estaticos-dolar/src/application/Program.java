// Exercício: Membros Estáticos - Conversor de Moedas
// Objetivo: Ler a cotação do dólar e a quantia comprada, exibindo o total a pagar em reais.

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);

        System.out.print("Amount to be paid in reais = " + String.format("%.2f", result));

        sc.close();
    }
}
