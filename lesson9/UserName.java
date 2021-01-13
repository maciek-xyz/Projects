package Lesson9;

import java.time.LocalDate;

public class UserName {
    String name;
    String secondName;
    LocalDate date;

    public UserName(String name, String secondName, LocalDate date) {
        this.name = name;
        this.secondName = secondName;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
