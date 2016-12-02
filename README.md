# SwingCalendar

A Weekly/Daily Swing JComponent Calendar View inspired by Google Calendar.

*Note that this project makes use of Java 8 features such as Lambdas.*

## Screenshots

Below, the current day these were taken was Friday, 18th November 2016 at 11:15am.

![Week View Calendar](/screenshots/WeekCalendar.png?raw=true "Week View Calendar")
![Day View Calendar](/screenshots/DayCalendar.png?raw=true "Day View Calendar")

## Info

I originally wrote this component as part of a group project for the COM2002 HCI module at The University of Sheffield.
There are countless improvements that can and should be made and I intend to develop this into a more extensible and publicly consumable component should I have the time (feel free to put in some PRs!).

As it stands, the calendar has a Weekly and Daily view and Events that fire on a CalendarEvent being clicked or an empty slot being clicked. These were particularly useful for the application this was originally intended for.

## Current limitations:

- Does not support showing weekends but this shouldn't be too hard to fix.
- Only shows times between 9:00 and 17:00. Again this shouldn't be too difficult to fix.
- Only supports events that occur within a single calendar day.