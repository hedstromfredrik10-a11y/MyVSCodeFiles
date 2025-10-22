package clock;

import java.util.Collection;
import alarm.AlarmManager;
import alarm.AlarmType;
import counter.Counter24;
import counter.Counter60;
import counter.Counter7;
import counter.SettableCounterType;
import time.*;

public class WeekAlarmClock implements AlarmClockType {

    private SettableCounterType days = new Counter7();
    private SettableCounterType hours = new Counter24(days);
    private SettableCounterType minutes = new Counter60(hours);
    private SettableCounterType seconds = new Counter60(minutes);

    private AlarmManager alarmManager = new AlarmManager();

    public WeekAlarmClock() {
    }

    public void tickTack() {
        seconds.count();
        alarmManager.checkForAlarm(getTime());
    }

    public void setTime(TimeType time) {
        this.days.setCount(time.getDay());
        this.hours.setCount(time.getHour());
        this.minutes.setCount(time.getMinute());
        this.seconds.setCount(time.getSecond());
    }

    public void addAlarm(AlarmType larm) {
        alarmManager.addAlarm(larm);
    }

    public void removeAlarm(AlarmType alarm) {
        alarmManager.removeAlarm(alarm);
    }

    public void removeAllAlarms() {
        alarmManager.removeAllAlarms();
    }

    public Collection<AlarmType> getAlarms() {
        return alarmManager.getAlarms();
    }

    public TimeType getTime() {
        return new Time(days.getCount(), hours.getCount(), minutes.getCount(), seconds.getCount());
    }

    public String toString() {
        return getTime().toString();
    }

}
