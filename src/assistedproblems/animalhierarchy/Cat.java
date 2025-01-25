package assistedproblems.animalhierarchy;

public class Cat extends Animal{
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println(name + " (Cat) says: Meow Meow!");
    }

}
