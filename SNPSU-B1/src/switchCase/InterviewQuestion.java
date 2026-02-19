package switchCase;
import java.util.Scanner;
public class InterviewQuestion {
    public static void main(String[] args) {
        // Return a value from a switch case
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        // MON, TUE, WED, THU, FRI - Weekday
        // SAT, SUN - Weekend
        String typeOfDay = switch (day){
            case  "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> {
                if (day.isEmpty()){
                    yield "Sorry! No data given!";
                }else {
                    yield "Invalid Data!";
                }
            }
        };
        System.out.println("Type of day is: " + typeOfDay);
    }
}
