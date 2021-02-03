package ua.lits.lesson17;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
  public static void main(String[] args) throws ParseException {
//    long time = System.currentTimeMillis() - 100000;
//
//    Date one = new Date();
//    Date two = new Date(time);
//    System.out.println(two.compareTo(one));
//    System.out.println(one.before(two));
//    System.out.println(one.after(two));
//
//    java.sql.Date dateSql = new java.sql.Date(time);
//    java.sql.Timestamp timestamp = new Timestamp(time);
//
//    Calendar calendar = new GregorianCalendar();
//    int year = calendar.get(Calendar.YEAR);
//    System.out.println(year);
//
//    int month = calendar.get(Calendar.MONTH);
//    System.out.println(month);
//    System.out.println("________");
//    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//    System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//    System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//    System.out.println("________");
//    System.out.println(calendar.get(Calendar.HOUR));
//    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//
//    Calendar independenceDay = new GregorianCalendar();
//    independenceDay.set(Calendar.YEAR, 1991);
//    independenceDay.set(Calendar.MONTH, 24);
//    independenceDay.set(Calendar.DAY_OF_MONTH, 34);
//
//    System.out.println(independenceDay.get(Calendar.MONTH));
//    System.out.println(independenceDay.getTime());
//    System.out.println(independenceDay.getTimeZone());

//    System.out.println(TimeZone.getDefault().getDisplayName());
//    System.out.println(TimeZone.getTimeZone("America/Los_Angeles"));
//    for (String id : TimeZone.getAvailableIDs()) {
//      System.out.println(id);
//    }
//    TimeZone.setDefault(TimeZone.getTimeZone("GMT+10"));
//    String date = "24.08.1991";
//
//    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
//    Date d = format.parse(date);
//    System.out.println(d);

//    ------
    /*
    yy or yyyy
    MM
    dd
    hh -> 12
    HH -> 24
    mm
    ss
    +0300
    dd.MM.yyyy HH:mm:ss.SSS Z
     */

//    SimpleDateFormat formatWithTimeZone = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS Z");
//      System.out.println(format.parse("12.01.1721 23:59:59.444 +1000"));
//    System.out.println(formatWithTimeZone.format(new Date()));
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss.SSS");
//    System.out.println(formatter.format(LocalDateTime.now()));

//    Instant one = Instant.now();
//    Instant two = one.minusSeconds(1000000);
//    Duration duration = Duration.between(one, two);
//    System.out.println(duration.plus(10, ChronoUnit.DAYS).toDays());
//    System.out.println(instant);
//    System.out.println(instant.plusSeconds(10));
//    System.out.println(instant.minusSeconds(1000000));
//    System.out.println(instant.minusMillis(1000000));
//    System.out.println(instant.minusNanos(1000000));
//
//    long milis = System.currentTimeMillis();
//    LocalDate localDate = LocalDate.now();
//    LocalDate l2 = LocalDate.of(2012, 6, 12);
//    LocalDate l3 = LocalDate.parse("2013-10-23");
//    LocalDate l4 = LocalDate.parse("12/12/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//    LocalDate l5 = LocalDate.of(2012, 2, 29);
//    System.out.println(localDate);
//    System.out.println(l2);
//    System.out.println(l3);
//    System.out.println(l4);
//    System.out.println(l5);
//    System.out.println(l5.getYear());
//    System.out.println(l5.getMonth());
//    System.out.println(l5.getDayOfMonth());
//    System.out.println(l5.plusDays(60));

//    LocalTime localTime = LocalTime.now();
//    System.out.println(localTime);
//    System.out.println(LocalTime.parse("23:11:55.98"));

//    LocalDateTime localDateTime = LocalDateTime.now();
//    System.out.println(localDateTime.plusHours(25));
//    System.out.println(localDateTime.isSupported(ChronoUnit.CENTURIES));
//    System.out.println(localDateTime.plus(1000, ChronoUnit.CENTURIES));

//    ZonedDateTime zonedDateTime = ZonedDateTime.now();
//    System.out.println(zonedDateTime);
    ZoneId zone = ZoneId.of("UTC-4");
//    ZoneId zoneTwo = ZoneId.of("Europe/Paris");
//
    ZonedDateTime one = ZonedDateTime.of(2015, 11, 30,23, 59, 12, 4145, zone);
//    ZonedDateTime two = ZonedDateTime.of(2015, 11, 30,23, 59, 12, 4145, zoneTwo);
//    System.out.println(one);
//    System.out.println(two);
//    System.out.println(one.isBefore(two));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss.SSS Z");
    System.out.println(formatter.format(one));
  }
}
