package hybridinheritance.restaurantmanagemetnsystemwithhybrid;

public class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    // method to display name and id
    @Override
    public void display() {
        super.display();
    }

    // method to display duties of person
    @Override
    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}

