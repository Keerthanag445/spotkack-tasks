import java.util.Scanner;
public class weeksDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week in numbers:");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("Day of the week:MONDAY");
                break;
            case 2:
                System.out.println("Day of the week:TUESDAY");
                break;
            case 3:
                System.out.println("Day of the week:WEDNESDAY");
                break;
            case 4:
                System.out.println("Day of the week:THURSDAY");
                break;
            case 5:
                System.out.println("Day of the week:FRIDAY");
                break;
            case 6:
                System.out.println("Day of the week:SATURDAY");
                break;
            case 7:
                System.out.println("Day of the week:SUNDAY");
                break;
        }
    }
}
