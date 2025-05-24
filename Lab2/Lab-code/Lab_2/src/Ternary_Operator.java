import java.util.Scanner;

    public class Ternary_Operator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a year: ");
            int Number = scanner.nextInt();
    
    
            String result = (Number %2==0)
                            ? Number + " is a Even Number."
                            : Number + " is a odd Number.";
    
            System.out.println(result);
            
            scanner.close(); 
        }
    }
    