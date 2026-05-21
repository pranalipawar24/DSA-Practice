package CollectionFramework.ComparableInterface;

public class Student implements Comparable<Student> {

    int age;
    String name;
    int weight;

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student that) {

        if(this.age == that.age) {
            return this.name.compareTo(that.name);
        }

        return that.age - this.age;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + weight;
    }
}
