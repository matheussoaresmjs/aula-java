package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Dentro:" + dentro);
        System.out.println("Fora:" + fora);



        sc.close();
    }
}
