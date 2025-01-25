package hybridinheritance.restaurantmanagemetnsystemwithhybrid;

public class Person  {
    // attributes
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("\nName : " + name + "\nid : " + id);
    }
}

// Interface
interface Worker {
    public void performDuties();
}
