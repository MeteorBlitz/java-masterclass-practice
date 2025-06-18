package oops;

public class ClassExample {
    // Properties (variables)
    String name;
    int age;

    // Constructor
    public ClassExample(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method
    public void displayInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        // Create object
        ClassExample person1 = new ClassExample("Deepak", 28);
        person1.displayInfo();
    }
}
