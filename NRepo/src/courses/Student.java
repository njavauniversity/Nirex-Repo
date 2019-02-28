package courses;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public Student(String fName, String lName) {
        courses = new ArrayList<>();
        grades = new HashMap<>();
        firstName = fName;
        lastName = lName;
    }

    public void PrintAll() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Courses: ");

        int iter = 0;
        for (Course tmp : courses) {
            iter++;
            System.out.println("Course Number " + iter + "'s Name: " + tmp.getName());
            System.out.println("Course Number " + iter + "'s Unit count: " + tmp.getUnitCount());
        }

        for (Course tmp : courses) {
            if (grades.containsKey(tmp)) {
                System.out.println("Grade for \"" + tmp.getName() + "\" course: " + grades.get(tmp));
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String in) {
        firstName = in;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String in) {
        lastName = in;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> in) {
        courses = in;
    }

    public HashMap<Course, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Course, Integer> in) {
        grades = in;
    }

    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    private HashMap<Course, Integer> grades;
}
