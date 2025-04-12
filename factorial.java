import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        int value = input.nextInt();
        int res=1;
        if(value<=1){
            System.out.println("Factorial of"+value+"is : 1");
        }
        else {
            for(int i =2;i<=value;i++){
                res= res*i;
            }
            System.out.println("Factorial of"+value+"is :"+res);
        }
    }
}
