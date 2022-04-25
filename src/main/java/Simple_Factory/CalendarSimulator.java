package Simple_Factory;

import java.util.Arrays;
import java.util.List;

public class CalendarSimulator {
    public static void main(String[] args) {
        ZoneFactory zoneFactory = new ZoneFactory();
        Calendar calendar = new PacificCalendar(zoneFactory);

        List<String> appts = Arrays.asList("appt 1", "appt2");
        calendar.createCalendar(appts);
        calendar.print();
    }
}
