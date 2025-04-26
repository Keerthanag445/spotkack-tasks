import java.util.Scanner;

public class vowelString {
    public int vowelCount(String str){
        int count =0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
        vowelString obj = new vowelString();
        System.out.println("Number of vowles in the string is: "+obj.vowelCount(str));
    }
}
