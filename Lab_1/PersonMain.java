public class PersonMain {
    public static void main(String[] args) {
        // Instance with a name and age
        Person person = new Person("Roselane Santos",36 );

        // Print the person's details
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Minor? " + person.isMinor());
    }
}