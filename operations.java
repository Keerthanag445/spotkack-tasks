import java.util.Scanner;

public class operations {
    public int add(int a ,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
    public int modulo(int a,int b){
        return a%b;
    }

    public static void main(String[] args) {
        operations obj = new operations();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextByte();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Addition of two nubmers:"+ obj.add(a,b) );
        System.out.println("Subtraction of two numbers:"+obj.sub(a,b));
        System.out.println("Multiplication of two numbers:"+obj.multiply(a,b));
        System.out.println("Division of two numbers:"+obj.divide(a,b));
        System.out.println("Modulo of two numbers:"+obj.modulo(a,b));
    }

}
