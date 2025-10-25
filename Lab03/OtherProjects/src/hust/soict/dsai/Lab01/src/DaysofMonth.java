import java.util.*;
public class DaysofMonth {
    private static final Map<String, Integer> MONTH = new HashMap<>();
    static {
        MONTH.put("1", 1);
        MONTH.put("JANUARY", 1); MONTH.put("JAN", 1); MONTH.put("JAN.", 1);

        MONTH.put("2", 2);
        MONTH.put("FEBRUARY", 2); MONTH.put("FEB", 2); MONTH.put("FEB.", 2);

        MONTH.put("3", 3);
        MONTH.put("MARCH", 3); MONTH.put("MAR", 3); MONTH.put("MAR.", 3);

        MONTH.put("4", 4);
        MONTH.put("APRIL", 4); MONTH.put("APR", 4); MONTH.put("APR.", 4);

        MONTH.put("5", 5);
        MONTH.put("MAY", 5);

        MONTH.put("6", 6);
        MONTH.put("JUNE", 6); MONTH.put("JUN", 6); MONTH.put("JUN.", 6);

        MONTH.put("7", 7);
        MONTH.put("JULY", 7); MONTH.put("JUL", 7); MONTH.put("JUL.", 7);

        MONTH.put("8", 8);
        MONTH.put("AUGUST", 8); MONTH.put("AUG", 8); MONTH.put("AUG.", 8);

        MONTH.put("9", 9);
        MONTH.put("SEPTEMBER", 9); MONTH.put("SEP", 9); ;MONTH.put("SEPT.", 9);

        MONTH.put("10", 10);
        MONTH.put("OCTOBER", 10); MONTH.put("OCT", 10); MONTH.put("OCT.", 10);

        MONTH.put("11", 11);
        MONTH.put("NOVEMBER", 11); MONTH.put("NOV", 11); MONTH.put("NOV.", 11);

        MONTH.put("12", 12);
        MONTH.put("DECEMBER", 12); MONTH.put("DEC", 12); MONTH.put("DEC.", 12);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = readValidYear(scanner);
        int month = readValidMonth(scanner);
        int days = daysInMonth(month, year);
        System.out.printf("Year %d, month %d has %d days.%n", year, month, days);
        scanner.close();
    }
    private static int readValidYear(Scanner scanner) {
        while (true) {
            System.out.print("Enter year: ");
            String input = scanner.nextLine().trim();
            if (input.matches("\\d+")) {
                try {
                    int y = Integer.parseInt(input);
                    if (y >= 0) return y;
                } catch (NumberFormatException e) {
                }
            }
            System.out.println("Invalid year");
        }
    }
    private static int readValidMonth(Scanner scanner) {
        while (true) {
            System.out.print("Enter month: ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (MONTH.containsKey(input)) {
                return MONTH.get(input);
            }
            System.out.println("Invalid month");
        }
    }
    private static int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return Leap(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }
    private static boolean Leap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
