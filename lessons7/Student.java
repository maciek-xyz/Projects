package Lesson7;

public class Student extends Person{
    private String Faculty;
    private int GraduateYear;

    public Student(String firstName, String lastName, int birthDate, String faculty, int graduateYear) {
        super(firstName, lastName, birthDate);
        this.Faculty = faculty;
        this.GraduateYear = graduateYear;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getGraduateYear() {
        return GraduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        GraduateYear = graduateYear;
    }
}
