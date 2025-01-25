package hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Person {
    // attributes
    private String name;
    private  int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's name and age
    public void displayDetails(){
        System.out.println("Name : "+name+"\nage : "+age);
    }

}
