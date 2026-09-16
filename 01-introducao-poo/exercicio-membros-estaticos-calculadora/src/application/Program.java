// Exercício: Membros Estáticos - Calculadora Utilitária
// Objetivo: Ler o raio fornecido pelo usuário e calcular a circunferência, volume e exibir o valor de PI utilizando a classe Calculator.

package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.println("Circumference: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("PI Value: " + String.format("%.2f", Calculator.PI));

        sc.close();
    }
}
