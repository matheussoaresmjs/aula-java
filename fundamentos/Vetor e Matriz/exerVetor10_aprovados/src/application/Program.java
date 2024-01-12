package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        double media;

        System.out.print("Quantos alunos serao informados? ");
        n = sc.nextInt();
        
        String[] alunos = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        //* double[] media = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            sc.nextLine();
            alunos[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
         // total[i] = nota1[i] + nota2[i]; 
        }
        System.out.println("Alunos Aprovados: ");

        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            
            if (media >= 6.0) {
                System.out.printf("%s\n", alunos[i]);
            }
        }


        sc.close();
    }
}
 //*    if (total[i] % 2 >= 6) {
 //*  System.out.printf("Alunos aprovados:", alunos[i]);