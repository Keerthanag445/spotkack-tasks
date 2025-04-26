import java.util.Scanner;

public class titleCase{
    public String toTitleCase(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                result += first + rest + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println("Enter a Sentence: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        titleCase obj = new titleCase();
        System.out.println("Sentence after convertion: "+obj.toTitleCase(str));
    }
}

