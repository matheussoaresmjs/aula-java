import entities.Student;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();

        System.out.println("Insira o nome do aluno e as notas trimestrais: ");
        student.name = sc.nextLine();

        System.out.println("Valor da Primeira grade: ");
        student.grade1 = sc.nextDouble();

        System.out.println("Valor da Segunda grade: ");
        student.grade2 = sc.nextDouble();

        System.out.println("Valor da Terceira grade: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2F POINTS%N", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        
        sc.close();
    }
}