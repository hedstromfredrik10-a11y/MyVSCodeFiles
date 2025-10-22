package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import View.MainView;
import alarm.Alarm;
import clock.WeekAlarmClock;
import time.Time;

public class Controller {

    WeekAlarmClock weekAlarmClock;
    MainView mainView;
    Alarm alarm;

    private int hour;
    private int minute;
    private int second;

    public Controller(WeekAlarmClock weekAlarm) {
        this.weekAlarmClock = weekAlarm;

        LocalTime currentTime = LocalTime.now();
        LocalDate day = LocalDate.now();
        String[] daysOfTheWeek = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
        int indexOfDay = 0;
        for (int i = 0; i <= 6; i++) {
            if (daysOfTheWeek[i].equals(day.getDayOfWeek().toString())) {
                indexOfDay = i;
            }
        }
        weekAlarmClock
                .setTime(new Time(indexOfDay, currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond()));

        this.hour = weekAlarmClock.getTime().getHour();
        this.minute = weekAlarmClock.getTime().getMinute();
        this.second = weekAlarmClock.getTime().getSecond();
    }

    public void setView(MainView mainView) {
        this.mainView = mainView;
    }

    public void setNewTime(int day, int hour, int minute, int seconds) {
        weekAlarmClock.setTime(new Time(day, hour, minute, seconds));
    }

    public void tickTheTack() {
        weekAlarmClock.tickTack();
        this.hour = weekAlarmClock.getTime().getHour();
        this.minute = weekAlarmClock.getTime().getMinute();
        this.second = weekAlarmClock.getTime().getSecond();
    }

    public String toString() {
        return weekAlarmClock.toString();
    }

    public void setTheAlarm(int days, int hour, int minute, int seconds) {
        weekAlarmClock.addAlarm(new Alarm(new Time(days, hour, minute, seconds)));
    }

    public String showAlarm() {
        return weekAlarmClock.getAlarms().toString();
    }

    public void removeAlarms() {
        weekAlarmClock.removeAllAlarms();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
