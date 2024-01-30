package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada do nmumero fatorial? ");
        int n = sc.nextInt();
		
		int fat = 1;
        //* Algoritmo p/ Fatorial */
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		System.out.println(fat);
		
		sc.close();
    }
}
