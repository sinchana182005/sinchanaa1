package MemberInnerClass;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;


public class WorkinhWithDateandTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date:" + date);
        LocalTime time =LocalTime.now();
        System.out.println("Time:" + time);
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println("Date&Time:"+dateTime);
/* Display the day of the month
display the day of the year
display the week name,month name,month number
E - Name of day :(mon to Sun)
D - day of the year(1 - 366)
 dd - Day of the month (1 - 31)
 M - Month Number (1-12)
 MMM - Month name - jan - dec */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted Date : " + formattedDateTime);
    }
}