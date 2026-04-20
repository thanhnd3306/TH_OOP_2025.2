//Exercise 6.4
import java.util.Scanner;

public class DisplayDayOfMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month;

        System.out.println("Enter a month (example: January, Jan., Jan, and 1); ");
        String inputMonth = scanner.next().toLowerCase();

        switch (inputMonth) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                month = 1;
                break;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                month = 2;
                break;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                month = 3;
                break;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                month = 4;
                break;
            case "may":
            case "5":
                month = 5;
                break;
            case "june":
            case "jun":
            case "6":
                month = 6;
                break;
            case "july":
            case "jul":
            case "7":
                month = 7;
                break;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                month = 8;
                break;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                month = 9;
                break;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                month = 10;
                break;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                month = 11;
                break;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                month = 12;
                break;
            default:
                System.out.println("Invalid month. Please enter a valid month.");
                scanner.close();
                return;
        }
        System.out.println("Enter a year (example: 1999): ");
        int year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year. Please enter a non-negative number.");
            scanner.close();
            return;
        }

        scanner.close();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        System.out.println("Number of days: " + days);
    }
}


