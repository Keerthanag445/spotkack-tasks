import java.util.Scanner;

public class oddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = input.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int odd=0;
        int even =0;
        for (int i =0;i<array.length;i++){
            if(array[i]%2==0){
                odd+=1;
            }
            else{
                even+=1;
            }
        }
        System.out.println("Number of odd elements in array: "+odd);
        System.out.println("Number of even elements in array: "+even);
    }
}
