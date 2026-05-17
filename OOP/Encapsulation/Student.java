package OOP.Encapsulation;

class Student {

    // Private data members
    private int id;
    private String name;

    // Setter methods
    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    // Getter methods
    public void getId() {
        System.out.println("Student ID : " + id);
    }

    public void getName() {
        System.out.println("Student Name : " + name);
    }
}
