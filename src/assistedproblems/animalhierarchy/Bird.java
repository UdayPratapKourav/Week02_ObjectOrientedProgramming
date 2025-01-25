package assistedproblems.animalhierarchy;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println(name + " (Bird) says: Tweet Tweet!");
    }

}
