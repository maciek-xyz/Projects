package Lesson9;

import java.time.LocalDate;

@FunctionalInterface
public interface GenerateBirthday {
    public int doSomething(LocalDate year);
}
