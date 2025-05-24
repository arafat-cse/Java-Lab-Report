import java.util.Scanner;

public class smallest {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE; 

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }
}
