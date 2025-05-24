public class leap_year {
    public static void main(String[] args){
        
        // int leapYear = 2024;
        int leapYear = 2023;
        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println( leapYear + " Is A leap Year");
        }else{
            System.out.println(leapYear + " Is A Not Leap Year");
        }

    }
}
