package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto: ");
            String name = sc.nextLine();
            System.out.println("Digite o valor do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double media = soma / vect.length; 
        System.out.printf("A média dos preços é: %.2f%n", media);

        sc.close();
    }
}