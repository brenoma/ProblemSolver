package Hackerrank.Prepare.Algorithms.Warmup;

public class TimeConversion {

    public static final String PM = "PM";

    public static final String AM = "AM";

    public static void main(String[] args) {
//        timeConversion("12:32:00PM");
        timeConversion("12:00:00PM");
    }

    public static String timeConversion(String s) {

        String[] result = {}, hourMinutesSeconds;
        int hour, minutes, seconds;

        if (s.contains(PM)) {
            result = s.split(PM);
        } else if (s.contains(AM)) {
            result = s.split(AM);
        }

        hourMinutesSeconds = result[0].split(":");
        hour = Integer.valueOf(hourMinutesSeconds[0]);
        minutes = Integer.valueOf(hourMinutesSeconds[1]);
        seconds = Integer.valueOf(hourMinutesSeconds[2]);

        if (s.contains(PM) && hour < 12) {
            hour = 12 + hour;
        }
        if (s.contains(AM) && hour == 12) hour = 0;

        s = String.format("%02d", hour) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);

        System.out.println(s);

        return s;
    }
}
