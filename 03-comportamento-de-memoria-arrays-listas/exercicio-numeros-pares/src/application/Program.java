// Exercício: Números Pares - Vetores de Objetos
// Objetivo: Ler N números inteiros, armazenar em um vetor de objetos, exibir apenas os pares e a contagem total.

package application;

import java.util.Scanner;

import entities.Number;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        Number[] vect = new Number[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            int val = sc.nextInt();
            vect[i] = new Number(val);
        }

        System.out.println("NUMEROS PARES:");
        int count = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].isEven()) {
                System.out.print(vect[i].getValue() + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + count);

        sc.close();
    }
}
