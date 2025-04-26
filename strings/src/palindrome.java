import java.util.Scanner;

public class palindrome {
    public boolean isPalindrome(String str){
        str= str.toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        palindrome obj = new palindrome();
        System.out.println("Is the given string palindrome or not? "+obj.isPalindrome(str));
    }
}
