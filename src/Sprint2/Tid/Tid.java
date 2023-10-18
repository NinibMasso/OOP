package Sprint2.Tid;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class Tid {

    Tid(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in en stad: ");
        String city = sc.nextLine().trim();
        city = city.substring(0,1).toUpperCase() + city.substring(1);
        try {
            Instant i = Instant.now();

            ZoneId currentZoneId = ZoneId.of("Toronto");
            ZonedDateTime TorontoZonedDateTime = i.atZone(currentZoneId);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd, HH:mm:ss");
            System.out.println(dtf.format(TorontoZonedDateTime));
        } catch (ZoneRulesException e){
            System.out.println("Något gick fel");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tid t = new Tid();
    }
}
