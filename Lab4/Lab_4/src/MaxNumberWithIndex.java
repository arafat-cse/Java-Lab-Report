import java.util.Scanner;

public class MaxNumberWithIndex {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number of element: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Integers: ");
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for(int i =1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Index of maximum number: " + index);
    }
}
