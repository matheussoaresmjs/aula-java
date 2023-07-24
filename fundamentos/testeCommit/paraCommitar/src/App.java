import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int s;
        double d;
        char a;

        System.out.println("Digite seu nome:");
        x = sc.next();

        System.out.println("Digite sua idade:");
        s = sc.nextInt();

        System.out.println("Digite sua altura:");
        d = sc.nextDouble();

        System.out.println("Escreva seu sexo:");
        a = sc.next().charAt(0);

        System.out.println("Nome: " + x);
        System.out.println("Idade: " + s);
        System.out.printf("Altura: %.2f %n", d);
        System.out.println("Sexo: " + a);

        sc.close();
    }
}