package hackerrank.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

// Problem on HackerRank: https://www.hackerrank.com/challenges/time-conversion
public class TimeConversion {

    public TimeConversion() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();

        String[] timeArr = time.split(":");

        // System.out.println(timeArr.length);

        int hours = Integer.parseInt(timeArr[0]);
        int minutes = Integer.parseInt(timeArr[1]);
        String type = timeArr[2].substring(2);
        int seconds = Integer.parseInt(timeArr[2].substring(0, 2));

        if (type.equalsIgnoreCase("pm")) {
            if (hours < 12 && hours > 0) {
                hours += 12;
                type = "";
            } else {
                type = "";
            }
        } else {
            if (hours == 12)
                hours = 0;
            type = "";
        }
        DecimalFormat formatter = new DecimalFormat("00");
        String hoursFormatted = formatter.format(hours);
        String minutesFormatted = formatter.format(minutes);
        String secondsFormatted = formatter.format(seconds);
        if (!type.equals(""))
            System.out.println(hoursFormatted + ":" + minutesFormatted + ":" + secondsFormatted + "PM");
        else
            System.out.println(hoursFormatted + ":" + minutesFormatted + ":" + secondsFormatted);

    }
}