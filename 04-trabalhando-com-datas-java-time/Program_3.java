package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program_3 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-10-15");
        LocalDateTime d05 = LocalDateTime.parse("2026-10-15T00:53:26");
        Instant d06 = Instant.parse("2026-10-15T00:53:26Z");

        // 1. Converter Instant (UTC/Zulu) para data/hora local baseada na zona
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Europe/Lisbon")); // Fuso de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Europe/Lisbon"));

        System.out.println("r1 (Local) = " + r1);
        System.out.println("r2 (Portugal) = " + r2);
        System.out.println("r3 (Local) = " + r3);
        System.out.println("r4 (Portugal) = " + r4);

        // 2. Obter dados individuais de LocalDate
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        // 3. Obter dados individuais de LocalDateTime
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());
    }
}