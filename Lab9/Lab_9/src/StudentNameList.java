import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentNameList {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Samaul");
        studentNames.add("Karim");
        studentNames.add("Arafat");
        studentNames.add("Tania");
        studentNames.add("Bashir");
        Collections.sort(studentNames);
        System.out.println("Sorted Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
