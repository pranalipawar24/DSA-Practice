package CollectionFramework;
import java.util.*;

class Student implements Comparable<Student>{

    int age;
    String name;
    int weight;

    Student(int age,String name,int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student that){

        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }

        return that.age - this.age;
    }

    @Override
    public String toString(){
        return age + " " + name + " " + weight;
    }
}

public class ComparatorInterface{

    public static void main(String[] args){

        List<Student> students =
                new ArrayList<>();

        students.add(new Student(19,"Vipul",68));
        students.add(new Student(23,"Love",87));
        students.add(new Student(23,"Ankit",55));
        students.add(new Student(7,"Billy",13));

        System.out.println("Before Sorting");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("\nAge Sorting");
        System.out.println(students);

        Collections.sort(
                students,
                (o1,o2) ->
                        o1.weight - o2.weight
        );

        System.out.println("\nWeight Sorting");
        System.out.println(students);
    }
}