import com.davidmoodie.SwingCalendar.Calendar;
import com.davidmoodie.SwingCalendar.CalendarEvent;
import com.davidmoodie.SwingCalendar.DayCalendar;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DayCalendarTest {
    public static void main(String[] args) {
        JFrame frm = new JFrame();

        ArrayList<CalendarEvent> events = new ArrayList<>();
        events.add(new CalendarEvent(LocalDate.of(2016, 11, 7), LocalTime.of(9, 0), LocalTime.of(9, 20), "Test 7/11 9:00-9:20"));
        events.add(new CalendarEvent(LocalDate.of(2016, 11, 9), LocalTime.of(9, 0), LocalTime.of(9, 20), "Test 9/11 9:00-9:20"));
        events.add(new CalendarEvent(LocalDate.of(2016, 11, 8), LocalTime.of(12, 0), LocalTime.of(13, 20), "Test 8/11 12:00-13:20"));
        events.add(new CalendarEvent(LocalDate.of(2016, 11, 4), LocalTime.of(14, 0), LocalTime.of(14, 20), "Test 4/11 14:00-14:20"));
        events.add(new CalendarEvent(LocalDate.of(2016, 11, 16), LocalTime.of(11, 30), LocalTime.of(12, 20), "Test 16/11 11:30-12:20"));

        DayCalendar cal = new DayCalendar(events);

        cal.addCalendarEventClickListener(e -> System.out.println(e.getCalendarEvent()));
        cal.addCalendarEmptyClickListener(e -> {
            System.out.println(e.getDateTime());
            System.out.println(Calendar.roundTime(e.getDateTime().toLocalTime(), 30));
        });

        JButton goToTodayBtn = new JButton("Today");
        goToTodayBtn.addActionListener(e -> cal.goToToday());

        JButton nextDayBtn = new JButton(">");
        nextDayBtn.addActionListener(e -> cal.nextDay());

        JButton prevDayBtn = new JButton("<");
        prevDayBtn.addActionListener(e -> cal.prevDay());

        JPanel weekControls = new JPanel();
        weekControls.add(prevDayBtn);
        weekControls.add(goToTodayBtn);
        weekControls.add(nextDayBtn);

        frm.add(weekControls, BorderLayout.NORTH);

        frm.add(cal, BorderLayout.CENTER);
        frm.setSize(1000, 900);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
