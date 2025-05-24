import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + 
               ", Name: " + name + 
               ", Grade: " + grade;
    }
}

public class StudentRecordManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student by Roll Number");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Invalid input
        }
    }
    
    private static void addStudent() {
        System.out.println("\n----- Add Student -----");
        
        System.out.print("Enter Roll Number: ");
        int rollNumber;
        try {
            rollNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number format. Please enter a number.");
            return;
        }
        
        // Check if roll number already exists
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student with this roll number already exists!");
                return;
            }
        }
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        
        students.add(new Student(rollNumber, name, grade));
        System.out.println("Student added successfully!");
    }
    
    private static void displayAllStudents() {
        System.out.println("\n----- All Students -----");
        
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
    
    private static void searchStudent() {
        System.out.println("\n----- Search Student -----");
        
        System.out.print("Enter Roll Number to search: ");
        int rollNumber;
        try {
            rollNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number format. Please enter a number.");
            return;
        }
        
        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No student found with roll number: " + rollNumber);
        }
    }
}