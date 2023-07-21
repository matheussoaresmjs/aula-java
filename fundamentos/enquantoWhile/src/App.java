import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();


        while (x != 0) {
            x = sc.nextInt();
        }

        sc.close();
    }
}
