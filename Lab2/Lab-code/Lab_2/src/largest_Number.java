import java.util.Scanner;

public class largest_Number {
    public static void main(String[] args) {
        Scanner largest = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = largest.nextInt();
        System.out.print("Enter second number: ");
        int num2 = largest.nextInt();
        System.out.print("Enter third number: ");
        int num3 = largest.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
        largest.close();
    }
}
