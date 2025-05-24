import java.util.HashSet;
import java.util.Set;

public class UniqueStudentIDCollector {
    public static void main(String[] args) {
        Set<String> studentIDs = new HashSet<>();
        studentIDs.add("Seu101");
        studentIDs.add("Seu102");
        studentIDs.add("Seu103");
        studentIDs.add("Seu101"); 
        studentIDs.add("Seu104");
        studentIDs.add("Seu102"); 
        System.out.println("Unique Student IDs:");
        for (String id : studentIDs) {
            System.out.println(id);
        }
    }
}
