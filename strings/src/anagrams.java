import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter second string: ");
        String str2 = input.nextLine();
        anagrams obj = new anagrams();
        System.out.println("Are they anagrams? " +obj.areAnagrams(str1,str2) ); // Output: true
    }
}
