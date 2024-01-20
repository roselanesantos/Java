import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor calling set methods
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // validation for name
    public void setName(String name) {
        
        if (isValidName(name)) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
    }

    // validation for age
    public void setAge(int age) {
        
        if (isValidAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }

    // Validation  name
    private boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    // Validation age
    private boolean isValidAge(int age) {
        return age >= 0 && age <= 120; //age range
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // check if the person is a minor
    public boolean isMinor() {
        return age < 18;
    }

}