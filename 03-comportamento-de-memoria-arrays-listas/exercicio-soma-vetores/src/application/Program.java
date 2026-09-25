// Exercício: Soma Vetores - Vetores de Objetos
// Objetivo: Ler dois vetores A e B de objetos Number, somar seus elementos correspondentes e gerar um terceiro vetor C.

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Number;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        Number[] vectA = new Number[n];
        Number[] vectB = new Number[n];
        Number[] vectC = new Number[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = new Number(sc.nextInt());
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = new Number(sc.nextInt());
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i].sum(vectB[i]);
            System.out.println(vectC[i].getValue());
        }

        sc.close();
    }
}
