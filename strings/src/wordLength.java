import java.util.Scanner;

public class wordLength {
    public int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.next();
        wordLength obj = new wordLength();
        System.out.println("Number of words: " + obj.countWords(str)); // Output: 3
    }
}
