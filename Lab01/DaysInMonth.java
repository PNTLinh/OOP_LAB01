import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = scanner.nextLine().toLowerCase();

            System.out.print("Enter the year (non-negative integer): ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            int daysInMonth = 0;
            boolean validInput = true;

            switch (monthInput) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    daysInMonth = 31;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    daysInMonth = 31;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    daysInMonth = 30;
                    break;
                case "may":
                case "5":
                    daysInMonth = 31;
                    break;
                case "june":
                case "jun":
                case "6":
                    daysInMonth = 30;
                    break;
                case "july":
                case "jul":
                case "7":
                    daysInMonth = 31;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    daysInMonth = 31;
                    break;
                case "september":
                case "sept.":
                case "sep":
                case "9":
                    daysInMonth = 30;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    daysInMonth = 31;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    daysInMonth = 30;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    daysInMonth = 31;
                    break;
                default:
                    System.out.println("Invalid month input. Please try again.");
                    validInput = false;
            }

            if (validInput && year >= 0) {
                System.out.println("There are " + daysInMonth + " days in " + monthInput + " " + year + ".");
                break; // Exit the loop if the input is valid
            } else {
                System.out.println("Invalid year input. Please try again.");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}