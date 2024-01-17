package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = 4;
        int y = 0;
        int i = 0;

        while (i < x) {
            i += 1;
            y += y;
            System.out.println(i);
            System.out.println(y);
        }

        sc.close();
    }
}
