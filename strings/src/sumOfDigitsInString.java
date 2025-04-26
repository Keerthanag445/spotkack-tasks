import java.util.Scanner;

public class sumOfDigitsInString {
    public int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = input.nextLine();
        sumOfDigitsInString obj = new sumOfDigitsInString();
        System.out.println("Sum of digits: " +obj.sumOfDigits(str)); // Output: 15
    }
}
