package assistedproblems.animalhierarchy;

public class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }

}
