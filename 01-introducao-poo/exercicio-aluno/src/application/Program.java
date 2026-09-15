// Exercício: Aluno - Introdução à POO
// Objetivo: Ler os dados do aluno, exibir a nota final e informar se foi aprovado ou quantos pontos faltaram.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));

        if (student.finalGrade() >= 60.0) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED\n" + "MISSING " + String.format("%.2f", student.missingPoints()) + " POINTS");
        }

        sc.close();
    }
}
