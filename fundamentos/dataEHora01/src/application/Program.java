package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) throws Exception {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato p/ padronização de data customizada.
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d01 = LocalDate.now(); // dia/mês/ano local
        LocalDateTime d02 = LocalDateTime.now(); //dia/mes/ano e hora local
        Instant d03 = Instant.now(); // dia/mes/ano e hora com fuso horario de londres

        // "parse é metodo estatico gerado a partir do LocalDate" //
        //  Gerando data e hora a partir de um "Texto ISO 8601"// // toString já chama, por padrão, em formato ISO 8601 //
        LocalDate d04 = LocalDate.parse("2022-07-20"); 
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Horario de Londres
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // adicional com GMT
        //Espeficicando formato customizado
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // formato customizado
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // formato customizado com hora

        // Outra forma de ser feito
        LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:40", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d11 = LocalDate.of(2022, 7, 20); //Ordem especifica
        LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
        System.out.println("d12 = " + d12.toString());

    }
}
