/*   Created by IntelliJ IDEA.
 *   Author: Kajal Bansal
 *   Date: 10/27/2020
 *   Time: 10:45 PM
 *   File: DaysLeftInMonth.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int numberOfDays;

    Months(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

public class DaysLeftInMonth {
    public static void main(String[] args) {
        int month = new GregorianCalendar().get(Calendar.MONTH);
        int day = new GregorianCalendar().get(Calendar.DATE);
        int year = new GregorianCalendar().get(Calendar.YEAR);
        Months[] nameOfMonths = Months.values();
        Months currentMonth = nameOfMonths[month];
        switch (currentMonth) {
            case JANUARY:
                System.out.println(Months.JANUARY.getNumberOfDays() + "-" + day + "=" + (Months.JANUARY.getNumberOfDays() - day) + " Days left in January!");
                break;
            case FEBRUARY:
                System.out.println(Months.FEBRUARY.getNumberOfDays() + "-" + day + "=" + (Months.FEBRUARY.getNumberOfDays() - day) + " Days left in February!");
                break;
            case MARCH:
                System.out.println(Months.MARCH.getNumberOfDays() + "-" + day + "=" + (Months.MARCH.getNumberOfDays() - day) + " Days left in March!");
                break;
            case APRIL:
                System.out.println(Months.APRIL.getNumberOfDays() + "-" + day + "=" + (Months.APRIL.getNumberOfDays() - day) + " Days left in April!");
                break;
            case MAY:
                System.out.println(Months.MAY.getNumberOfDays() + "-" + day + "=" + (Months.MAY.getNumberOfDays() - day) + " Days left in May!");
                break;
            case JUNE:
                System.out.println(Months.JUNE.getNumberOfDays() + "-" + day + "=" + (Months.JUNE.getNumberOfDays() - day) + " Days left in JUNE!");
                break;
            case JULY:
                System.out.println(Months.JULY.getNumberOfDays() + "-" + day + "=" + (Months.JULY.getNumberOfDays() - day) + " Days left in JULY!");
                break;
            case AUGUST:
                System.out.println(Months.AUGUST.getNumberOfDays() + "-" + day + "=" + (Months.AUGUST.getNumberOfDays() - day) + " Days left in AUGUST!");
                break;
            case SEPTEMBER:
                System.out.println(Months.SEPTEMBER.getNumberOfDays() + "-" + day + "=" + (Months.SEPTEMBER.getNumberOfDays() - day) + " Days left in September!");
                break;
            case OCTOBER:
                System.out.println(Months.OCTOBER.getNumberOfDays() + "-" + day + "=" + (Months.OCTOBER.getNumberOfDays() - day) + " Days left in October!");
                break;
            case NOVEMBER:
                System.out.println(Months.NOVEMBER.getNumberOfDays() + "-" + day + "=" + (Months.NOVEMBER.getNumberOfDays() - day) + " Days left in November!");
                break;
            case DECEMBER:
                System.out.println(Months.DECEMBER.getNumberOfDays() + "-" + day + "=" + (Months.DECEMBER.getNumberOfDays() - day) + " Days left in December!");
                break;

        }
    }
}
