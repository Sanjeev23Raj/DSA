import java.util.Scanner;
class Main{
    public static String weekofday(int day , int month , int year)
    {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int f = day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j);
        int index = ((f % 7) + 7) % 7; //
        return days[index];
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter day");
        int day = s.nextInt();
        System.out.println("Enter month");
        int month = s.nextInt();
        System.out.println("Enter year");
        int year = s.nextInt();

        System.out.println(weekofday(day, month, year));
    }
}