package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 0.0, 500.0);

        // UPCASTING - é uma forma de instanciar objetos com subclasses  diferentes porém mantendo uma superclasse em comum.

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING - Geralmente tem conversão da HiperClasse pra SubClasse

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3; AQUI DA RUIM PORQUE A INSTANCIA É DIFERENTE

        // instaceof - é uma função para saber se uma instancia pertence a uma classe/subclasse

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // Exemplos utilizando a sobreEscrita do Override

        Account acc10 = new Account(1001, "Bekka", 1000.0);
        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());

        Account acc20 = new SavingsAccount(1002, "Nit", 1000.0, 0.01);
        acc20.withdraw(200.0);
        System.out.println(acc20.getBalance());

        Account acc30 = new BusinessAccount(1003, "Taina", 1000.0, 500.0);
        acc30.withdraw(200.0);
        System.out.println(acc30.getBalance());
        
    }
}
