
//convert Hours into second
import java.util.*;

public class HrToSec {
    static int minute(int hour) {
        int sec = 0;
        sec = hour * (60 * 60);
        return sec;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Hours: ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        System.out.println(minute(hour));
    }
}
