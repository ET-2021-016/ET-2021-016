// Class Person
class Person {
    private String name;

    // Constructor to set name
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

// Class Student that inherits from Person
class Student extends Person {
    public Student(String name) {
        super(name);
    }
}
