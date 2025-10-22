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

    private AlarmManager alarmmanager = new AlarmManager();

    public WeekAlarmClock() {
    }

    public void tickTack() {
        seconds.count();
        alarmmanager.checkForAlarm(getTime());
    }

    public void setTime(TimeType time) {
        this.days.setCount(time.getDay());
        this.hours.setCount(time.getHour());
        this.minutes.setCount(time.getMinute());
        this.seconds.setCount(time.getSecond());
    }

    public void addAlarm(AlarmType larm) {
        alarmmanager.addAlarm(larm);
    }

    public void removeAlarm(AlarmType alarm) {
        alarmmanager.removeAlarm(alarm);
    }

    public void removeAllAlarms() {
        alarmmanager.removeAllAlarms();
    }

    public Collection<AlarmType> getAlarms() {
        return alarmmanager.getAlarms();
    }

    public TimeType getTime() {
        return new Time(days.getCount(), hours.getCount(), minutes.getCount(), seconds.getCount());
    }

    public String toString() {
        return getTime().toString();
    }

}
