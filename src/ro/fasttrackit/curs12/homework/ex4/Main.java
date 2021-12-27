package ro.fasttrackit.curs12.homework.ex4;

import java.util.List;

import static ro.fasttrackit.curs12.homework.ex4.DaysOfTheWeek.FRIDAY;
import static ro.fasttrackit.curs12.homework.ex4.DaysOfTheWeek.MONDAY;

public class Main {
    public static void main(String[] args) {
        DaySchedule monday = new DaySchedule(MONDAY, List.of("take breakfast", " meet Kevin"));
        System.out.println(monday.getActivities());
        monday.addActivity("General meeting at 11AM");
        System.out.println(monday.getActivities());
        DaySchedule friday = new DaySchedule(FRIDAY, null);
        System.out.println(friday.getActivities());
        friday.addActivity("pay the rent");
        System.out.println(friday.getActivities());
    }
}
