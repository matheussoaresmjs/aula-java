import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) throws Exception {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // subtraindo dias
        LocalDate nextWeekLocalDate = d04.plusDays(7); // adicionando ano

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("pastWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // subtraindo dias
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // adicionando dia

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("pastWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0,0)); // calculando a duração entre as duas datas at.Time é uma conversão, já que o LocalDate não tem hora. O melhor aconselhado é "atStartOfDay()"
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05); // calcula o tempo entre dois tempos
        Duration t3 = Duration.between(pastWeekInstant, d06);

        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("Duração t1 = " + t1.toDays());
        System.out.println("Duração t2 = " + t2.toDays()); // formato de dias
        System.out.println("Duração t3 = " + t3.toDays());

        System.out.println("Duração t4 = " + t4.toDays());


        }
        
    }
