// Exercício: Vetores de Objetos - Preço Médio
// Objetivo: Ler N produtos, armazenar em um vetor de objetos e calcular o preço médio.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
