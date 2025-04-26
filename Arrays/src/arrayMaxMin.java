import java.util.Scanner;

public class arrayMaxMin {
    public int maximum(int array[]){
        int max = array[0];
        for(int i=1;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public int minimum(int array[]){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the values to store in the array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        arrayMaxMin obj = new arrayMaxMin();
        System.out.println("Maximum value: " + obj.maximum(array));
        System.out.println("Minimum value: " + obj.minimum(array));
    }
}
