import java.time.LocalDate;
import java.time.LocalTime;
//localTime and Date package were auto added
public class date {
    public static void main(String[] args) {
        LocalTime trenutnoVreme = LocalTime.now();
        System.out.println(trenutnoVreme);
        //i forgot () after now
        LocalDate trenutniDatum = LocalDate.now();
        System.out.println(trenutniDatum);
    }
}
