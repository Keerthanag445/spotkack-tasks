import java.util.Scanner;

public class SumOfTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter number of columns");
        int columns = input.nextInt();
        int [][] array =new int[rows][columns];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j]=input.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum+=array[i][j];
            }
        }
        System.out.println("Sum of the 2D array is:"+sum);
    }
}
