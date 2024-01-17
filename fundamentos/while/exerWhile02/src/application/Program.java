package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = 0;

        while (x < 5) {
            int y = x * 3;
            System.out.println(y);
            x = x + 1;
        }

        System.out.println("Fim");

        sc.close();
    }
}
