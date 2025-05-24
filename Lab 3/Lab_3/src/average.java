import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 4;
        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
             sum += num ;
        }
        double average = (double)sum/count;
        System.out.println("The Average number is: " + average);
        scanner.close();
    }
}
