import java.util.Scanner;

public class greatestThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println("Enter thrid number:");
        int c = input.nextInt();

        // using if-elseif to check the greatest number among three inputs

        if(a>b && a>c){
            System.out.println("a is greatest");
        }
        else if (b>c) {
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }
    }
}
