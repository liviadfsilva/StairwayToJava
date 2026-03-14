package stairway.to.java.ChronoCheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Chrono Check!");
        System.out.println("Type a month of your choice:");

        String month = scanner.nextLine().toUpperCase();
        String prettyMonth = month.substring(0,1)
            .toUpperCase() + month.substring(1).toLowerCase();

        System.out.println("Now a year to find out if it's a leap year:");

        int year = scanner.nextInt();

        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        System.out.println("Month: " + prettyMonth + " — Number of Days: " + 
            MonthYear.valueOf(month).getDays(leap));

        System.out.println("Year: " + year + " — Is a Leap Year: " + leap);

        scanner.close();
    }
}
