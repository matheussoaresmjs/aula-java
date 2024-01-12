package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {|
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Dados do produto #" + i + ":");
            System.out.println("Comum, usado, importado (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.println("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Preco");
            Double price = sc.nextDouble();
            if (type == 'c') {

            }
        }

        sc.close();
    }
}
