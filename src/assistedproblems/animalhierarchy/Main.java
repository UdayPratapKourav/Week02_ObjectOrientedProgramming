package assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        // Create instances of each animal
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Call makeSound() for each animal (polymorphism in action)
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }

}
