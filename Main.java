import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class STUDENT {
    String name;
    int rollNo;
}

public class Main {
    public static void main(String[] args) {
        List<STUDENT> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            STUDENT student = new STUDENT();
            System.out.print("Enter name for student " + (i+1) + ": ");
            student.name = System.console().readLine();
            System.out.print("Enter roll no for student " + (i+1) + ": ");
            student.rollNo = Integer.parseInt(System.console().readLine());
            students.add(student);
        }

        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

        for (STUDENT student : students) {
            System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}