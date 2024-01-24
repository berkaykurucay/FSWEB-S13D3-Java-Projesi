public class Person {

    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Additional instance variables
    private String gender;
    private boolean isStudent;
    private double height;

    // Constructor with required parameters
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloaded constructor with additional parameters
    public Person(String firstName, String lastName, int age, String gender, boolean isStudent, double height) {
        // Constructor chaining
        this(firstName, lastName, age);

        // Set additional instance variables
        this.gender = gender;
        this.isStudent = isStudent;
        this.height = height;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Method to check if the person is a teen
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Alice", "Smith", 16, "Female", true, 165.5);

        // Accessing and printing information using getter methods
        System.out.println("Person 1:");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("\nPerson 2:");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());
    }
}
