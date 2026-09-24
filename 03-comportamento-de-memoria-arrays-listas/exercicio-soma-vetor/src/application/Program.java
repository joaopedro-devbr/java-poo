// Exercício: Soma Vetor - Vetores Primitivos
// Objetivo: Ler N números reais, armazenar em vetor, imprimir todos os elementos e calcular a soma e a média deles.

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.println();

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println("SOMA = " + String.format("%.2f", sum));
        System.out.println("MEDIA = " + String.format("%.2f", avg));

        sc.close();
    }
}
