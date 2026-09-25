// Exercício: Maior Posição - Vetores de Objetos
// Objetivo: Ler N números reais, identificar o maior valor armazenado no vetor de objetos e a sua respetiva posição.

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.RealNumber;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        RealNumber[] vect = new RealNumber[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            double value = sc.nextDouble();
            vect[i] = new RealNumber(value);
        }

        double highest = vect[0].getValue();
        int posHighest = 0;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getValue() > highest) {
                highest = vect[i].getValue();
                posHighest = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n" , highest);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n" , posHighest);

        sc.close();
    }
}
