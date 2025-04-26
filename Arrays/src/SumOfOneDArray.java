import java.util.Scanner;

public class SumOfOneDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = input.nextInt();
        System.out.println("Enter the elemente odf the array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int sum=0;
        for (int i =0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("Sum of the 1D array is:"+sum);
    }
}
