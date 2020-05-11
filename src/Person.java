public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long pesel;

    public Person(String firstName, String lastName, int age, long pesel) {
        if (firstName == null || lastName == null)
            throw new NameUndefinedException("First & second name cannot be null");
        else if (firstName.length() < 3 || lastName.length() < 3)
            throw new NameUndefinedException("First or second name are less then 2 characters");
        else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        if (age < 1) throw new IncorrectAgeException("Age cannot be less then 1");
        else
            this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
