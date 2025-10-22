package Lab1;

import java.util.concurrent.TimeUnit;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        int sec = 0;
        int min = 0;
        int hour = 0;

        while (sec < 59) {

            System.out.println(hour + ":" + min + ":" + sec);
            TimeUnit.SECONDS.sleep(1);
            sec++;

            if (sec == 59) {
                sec = 0;
                min++;
                if (min == 59) {
                    min = 0;
                    hour++;
                    if (hour == 23) {
                        hour = 0;
                    }
                }
            }

        }
    }
}
