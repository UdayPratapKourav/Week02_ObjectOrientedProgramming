class Circle {
    private double radius;

    // Default constructor
    Circle() {
        this(20.36);  // Constructor chaining with default radius
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display the radius
    public void display() {
        System.out.println("Radius of the circle is: " + radius);
    }
}

public class CircleRad {
    public static void main(String[] args) {
        Circle cir = new Circle();  // Using default constructor
        cir.display();

        Circle cir2 = new Circle(26.35);  // Using parameterized constructor
        cir2.display();
    }
}
