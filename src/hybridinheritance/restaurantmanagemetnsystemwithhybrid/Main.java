package hybridinheritance.restaurantmanagemetnsystemwithhybrid;

public class Main { public static void main(String[] args) {
    // Chef class's object
    Chef chef = new Chef("Karan", 101);
    // Waiter class's object
    Waiter waiter = new Waiter("Rahul", 102);

    // call for display and performDuties method by both objects
    chef.display();
    chef.performDuties();

    waiter.display();
    waiter.performDuties();
}
}
