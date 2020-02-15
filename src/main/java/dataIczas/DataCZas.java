package dataIczas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DataCZas {
    public static void main(String[] args) {

        LocalDate obcenie = LocalDate.now();
        LocalDate urodziny = LocalDate.of(1989, 9, 14);
        System.out.println(urodziny.getDayOfWeek());
        Period between = Period.between(urodziny, obcenie);
        System.out.println(between.getYears() + " " + between.getMonths() + " " + between.getDays());
        long between1 = ChronoUnit.DAYS.between(urodziny, obcenie);
        System.out.println(between1);
        Duration duration = Duration.ofSeconds(6095);
        System.out.println(duration.toHoursPart());
        System.out.println(duration.toMinutesPart());
        System.out.println(duration.toSecondsPart());

    }
}
