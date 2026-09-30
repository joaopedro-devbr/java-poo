// Exercício: Aumento de Salário com Listas
// Objetivo: Registar N funcionários em uma List<Employee>, efetuar o aumento salarial por ID e listar os resultados.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine();

            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employeer id that will have salary increase : ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } 
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
