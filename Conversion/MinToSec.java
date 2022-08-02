
//convert minute into second
import java.util.*;

public class MinToSec {
    static int minute(int min) {
        int sec = 0;
        sec = min * 60;
        return sec;
    }

    public static void main(String[] args) {
        System.out.println("Enter the minutes: ");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println(minute(min));
    }

}