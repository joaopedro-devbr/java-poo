// Exercício: Funcionário - Introdução à POO
// Objetivo: Ler os dados do funcionário, exibir os dados com salário líquido e atualizar os dados após o aumento.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee enployee = new Employee();

        System.out.print("Name: ");
        enployee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        enployee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        enployee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + enployee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        enployee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + enployee);

        sc.close();
    }
}
