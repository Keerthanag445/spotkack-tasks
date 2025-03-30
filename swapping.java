import java.util.Scanner;

public class swapping {
    public void swappingWithVariable(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);

    }
    public void swappingWithoutVarible(int a,int b){
        int c = a+b;
        a=c-a;
        b=c-b;
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);

    }

    public static void main(String[] args) {
        swapping obj = new swapping();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = input.nextInt();
        System.out.println("Enter second value:");
        int b = input.nextInt();

        System.out.println("After Swapping With Variable:");
        obj.swappingWithVariable(a,b);

        System.out.println("Enter first value:");
        int c = input.nextInt();
        System.out.println("Enter second value:");
        int d = input.nextInt();

        System.out.println("After Swapping Without Variable:");
        obj.swappingWithoutVarible(c,d);

        input.close();

    }
}
