public class TestEncapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Arafat");
        obj.setRollNo(51);
        try {
            obj.setGpa(3.5); 
        } catch (IllegalArgumentException e) {
            System.out.println(  e.getMessage());
        }
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's rollNo: " + obj.getRollNo());
        System.out.println("Student's gpa: " + obj.getGpa());
    }
}