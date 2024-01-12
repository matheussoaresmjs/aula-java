package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Insira um numero inteiro: ");
        num = sc.nextInt();

        if (num<0) {
            System.out.println("Numero Negativo");
        } 
        else {
            if (num<0){
                System.out.println("Numero Positivo");
            }
            else
                System.out.println("Numero Neutro");
        }

        sc.close();
    }
}
