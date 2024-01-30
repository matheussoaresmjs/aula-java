package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas repetições terão?");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            double primeiro = sc.nextDouble();
            double segundo = sc.nextDouble();

            if (segundo == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resul = (primeiro / segundo);
                System.out.println("Resultado: " + resul);
            }
        }

        sc.close();
    }
}
