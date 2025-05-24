import java.util.Scanner;

public class Grade_mark {
    public static void main(String [] args){
         Scanner GradeMark = new Scanner(System.in);
          System.out.println("Enter Your Number:");
          float Number = GradeMark.nextInt();
        if(Number > 100){
            System.out.println("Invalid Number");
        }else if(Number >=80){
            System.out.println("A+");
          }else if (Number >= 75 && Number < 80) {
            System.out.println("A");
          }else if (Number >= 70 && Number < 75) {
            System.out.println("A-");
          }else if (Number >= 65 && Number < 70) {
            System.out.println("B+");
          }else if (Number >= 60 && Number < 65) {
            System.out.println("B");
          }else if (Number >= 55 && Number <60 ) {
            System.out.println("B-");
          }else if (Number >= 50 && Number < 55) {
            System.out.println("C+");
          }else if (Number >= 45 && Number < 50) {
            System.out.println("C");
          }else if (Number >= 40 && Number < 45) {
            System.out.println("D+");
          }else if (Number >=0 && Number < 40) {
            System.out.println("F(fail)");
          }else{
            System.out.println("l+");
          }
          GradeMark.close();
    }
}
