package clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import time.Time;
import alarm.Alarm;
import alarm.AlarmManager;
import alarm.AlarmType;
import counter.Counter24;
import counter.Counter60;
import counter.Counter7;
import counter.SettableCounterType;

public class WeekAlarmClockTest {
    SettableCounterType days = new Counter7();
    SettableCounterType hours = new Counter24(days);
    SettableCounterType minutes = new Counter60(hours);
    SettableCounterType seconds = new Counter60(minutes);
    AlarmClockType weekAlarmClock = new WeekAlarmClock();
    AlarmManager alarmManager = new AlarmManager();

    @Test
    public void testDaysHoursMinutsAndSeconds() {
        for (int i = 0; i < 60; i++) {
            seconds.count();
            minutes.count();
        }

        assertEquals(0, days.getCount());
        assertEquals(1, hours.getCount());
        assertEquals(1, minutes.getCount());
        assertEquals(0, seconds.getCount());

        for (int i = 0; i < 24; i++) {
            hours.count();
        }

        assertEquals(1, days.getCount());
        assertEquals(1, hours.getCount());
        assertEquals(1, minutes.getCount());
        assertEquals(0, seconds.getCount());

    }

    @Test
    public void testAddAlarm() {
        // Första alarmet bör ge utslag. Alarm: 1
        AlarmType alarm = new Alarm(new Time(0, 0, 0, 2));
        weekAlarmClock.addAlarm(alarm);
        weekAlarmClock.tickTack();
        weekAlarmClock.tickTack();
    }

    @Test
    public void testRemoveAlarm() {
        // Andra alarmet bör inte ge utslag. Alarm: 1
        AlarmType alarm2 = new Alarm(new Time(0, 0, 0, 4));
        weekAlarmClock.addAlarm(alarm2);
        weekAlarmClock.tickTack();
        weekAlarmClock.tickTack();
        weekAlarmClock.tickTack();
        weekAlarmClock.removeAlarm(alarm2);
        weekAlarmClock.tickTack();
    }

    @Test
    public void testIfTheAlarmWorksAtSetTime() {
        // Tredje alarmet bör ge utslag. Alarm: 2
        weekAlarmClock.setTime(new Time(2, 13, 45, 0));
        AlarmType alarm3 = new Alarm(new Time(2, 13, 45, 1));

        weekAlarmClock.addAlarm(alarm3);
        weekAlarmClock.tickTack();

        // Fjärde alarmet bör ge utslag: Alarm: 3
        weekAlarmClock.setTime(new Time(6, 23, 59, 59));
        AlarmType alarm4 = new Alarm(new Time(0, 0, 0, 0));

        weekAlarmClock.addAlarm(alarm4);
        weekAlarmClock.tickTack();
    }

    @Test
    public void testGetTime() {
        weekAlarmClock.setTime(new Time(3, 14, 12, 0));
        assertEquals("Thu 14:12:00", weekAlarmClock.getTime().toString());
    }
}
