import java.util.Scanner;

public class Switch_Vowel {
    public static void main(String [] args){
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter Your alphabet");
       char alpha = alphabet.next().toLowerCase().charAt(0);
        switch (alpha) {
            case 'a':
                System.out.println( alpha + " Is a vowel");
                break;
                case 'e':
                System.out.println( alpha + " Is a vowel");
                break;
                case 'i':
                System.out.println( alpha + " Is a vowel");
                break;
                case 'o':
                System.out.println( alpha + " Is a vowel");
                break;
                case 'u':
                System.out.println( alpha + " Is a vowel");
                break;
            default:
                System.out.println( alpha + " Is a Consonant.");
                break;
        }
        alphabet.close();
    }
}
