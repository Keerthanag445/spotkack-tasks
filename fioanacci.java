import java.util.Scanner;

public class fioanacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        int count = input.nextInt();
        int a = 0;
        int b = 1;
        int res;
        System.out.print(a+" "+b);
        for(int i=2;i<count;i++){
            res = a+b;
            System.out.print(" "+res);
            a=b;
            b=res;
        }
    }
}
