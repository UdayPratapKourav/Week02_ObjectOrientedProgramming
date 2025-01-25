package hybridinheritance.restaurantmanagemetnsystemwithhybrid;

public class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    // method to display name and id
    @Override
    public void display() {
        super.display();
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}
