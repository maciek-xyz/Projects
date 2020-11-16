package Lesson7;
import java.time.LocalDate;


public class Person {
    private String FirstName;
    private String LastName;
    private int BirthDate;

    public Person(String firstName, String lastName, int birthDate) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.BirthDate = birthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(int birthDate) {
        BirthDate = birthDate;
    }
}
