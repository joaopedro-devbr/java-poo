// Exercício: Herança - Account e BusinessAccount
// Objetivo: Praticar herança, reutilização de métodos e
// especialização de classes em Java.

package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(
                1002, "Maria", 0.0, 500.0
        );

        acc.deposit(1000.0);

        System.out.println("Account:");
        System.out.println("Number: " + acc.getNumber());
        System.out.println("Holder: " + acc.getHolder());
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(200.0);

        System.out.println("Balance after withdraw: " + acc.getBalance());

        System.out.println();

        bacc.deposit(1000.0);

        System.out.println("Business Account:");
        System.out.println("Number: " + bacc.getNumber());
        System.out.println("Holder: " + bacc.getHolder());
        System.out.println("Balance: " + bacc.getBalance());
        System.out.println("Loan limit: " + bacc.getLoanLimit());

        bacc.loan(300.0);

        System.out.println("Balance after loan: " + bacc.getBalance());
    }
}
