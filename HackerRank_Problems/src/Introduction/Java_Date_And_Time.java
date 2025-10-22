package Introduction;

import java.io.*;
/* import java.math.*;
import java.security.*;
import java.text.*; */
import java.time.DayOfWeek;
import java.time.LocalDateTime;

/* import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 */

public class Java_Date_And_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }

    class Result {

        Java_Date_And_Time jd = new Java_Date_And_Time();

        public static String findDay(int month, int day, int year) {
            LocalDateTime localdatetime = LocalDateTime.of(year, month, day, 0, 0, 0);

            DayOfWeek dayofweek = localdatetime.getDayOfWeek();

            return dayofweek.toString();

        }

    }
}
