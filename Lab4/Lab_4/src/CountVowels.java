import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputVowels = scanner.nextLine().toLowerCase();
        int count = 0;
        for( int i = 0; i <inputVowels.length(); i++){
            char ch = inputVowels.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
