package CollectionFramework.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "Vipul", 68));
        students.add(new Student(23, "Love", 87));
        students.add(new Student(23, "Ankit", 55));
        students.add(new Student(7, "Billy", 13));

        System.out.println("Before Sorting:");
        System.out.println(students);

        // Sorting using Comparable
        Collections.sort(students);

        System.out.println("\nAfter Sorting:");
        System.out.println(students);
    }
}
