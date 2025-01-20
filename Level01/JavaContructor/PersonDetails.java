
class Person {
    private String name;
    private int age;
    private String address;

    // Constructor to initialize a person object
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor to clone another person object
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        this.address = otherPerson.address;
    }

    // Getter methods to access person's details
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Method to display person's information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating a person object
        Person person1 = new Person("John Doe", 30, "1234 Elm Street");

        // Creating a clone of person1 using the copy constructor
        Person person2 = new Person(person1);

        // Displaying information of both persons
        System.out.println("Original Person Info:");
        person1.displayPersonInfo();

        System.out.println("\nCloned Person Info:");
        person2.displayPersonInfo();
    }
}

